package esp.sn.clientsoap.controller;

import esp.sn.clientsoap.model.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import jakarta.servlet.http.Cookie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import proxy.*;


@Controller
public class UserController {

    UserService proxy = new UserWS().getUserServicePort();
    String token;
    User user = new User();
    @ModelAttribute(name = "user")
    public User user() {
        return new User();
    }

    @GetMapping("/")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@Valid User user, Errors errors, Model model, HttpServletResponse response) {
        String message = proxy.getAdminToken(user.getUsername(), user.getPassword());

        if (!isJwtToken(message)) {
            model.addAttribute("error", message);
            return "login";
        }

        token = message;
        Cookie cookie = new Cookie("jwtToken", message);
        cookie.setPath("/");
        response.addCookie(cookie);
        return "redirect:/users";
    }

    @GetMapping("/users")
    public String getUsers(Model model, HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        this.iniatilzeToken(cookies);

        if (token == null) {
            model.addAttribute("error", "Veuillez vous authentifier d'abord");
            return "login";
        }

        model.addAttribute("users", proxy.getUsers(token));
        return "users";
    }

    @GetMapping("/addUser")
    public String addUserForm(Model model, HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        this.iniatilzeToken(cookies);
        if (token == null){
            model.addAttribute("error", "Veuillez vous authentifier d'abord");
            return "redirect:/login";
        }
        return "add";
    }

    @PostMapping("/storeUser")
    public String storeUser(@Valid User user, Model model, HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        this.iniatilzeToken(cookies);
        if (token == null){
            model.addAttribute("error", "Veuillez vous authentifier d'abord");
            return "redirect:/";
        }

        if (!user.getPassword().equals(user.getConfirmPassword())) {
            model.addAttribute("error_password", "Les mots de passe ne sont pas identiques");
            return "redirect:/add";
        }

        String message = proxy.addUser(user.getUsername(), user.getPassword(), user.getRole(), token);
        model.addAttribute("message", message);
        return "redirect:/users";
    }


    @GetMapping("/users/{username}")
    public String updateForm(@PathVariable("username") String username, Model model, HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        this.iniatilzeToken(cookies);

        if (token == null){
            model.addAttribute("error", "Veuillez vous authentifier d'abord");
            return "login";
        }

        proxy.User _user = proxy.userByUsername(username, token);
        user.setRole(_user.getRole());
        user.setUsername(_user.getUsername());
        model.addAttribute("user", user);

        return "edit";
    }

    @PostMapping("/update")
    public String updateUser(@Valid User user, Errors errors, Model model) {
        if (token == null){
            model.addAttribute("error", "Veuillez vous authentifier d'abord");
            return "redirect:/";
        }

        if (!user.getPassword().equals(user.getConfirmPassword())) {
            model.addAttribute("error_password", "Les mots de passe ne sont pas identiques");
            model.addAttribute("user", this.user);
            return "redirect:/edit";
        }

        String response = proxy.updateUser(this.user.getUsername(), user.getPassword(), this.user.getRole(), token);
        model.addAttribute("message", response);
        model.addAttribute("user", this.user);
        return "redirect:/edit";
    }

    @PostMapping("/delete")
    public String deleteUser(@RequestParam("username") String username, Model model, HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        this.iniatilzeToken(cookies);
        if (token == null){
            model.addAttribute("error", "Veuillez vous authentifier d'abord");
            return "redirect:/login";
        }

        String message = proxy.deleteUser(username, token);
        model.addAttribute("message", message);
        return "redirect:/users";
    }

    @GetMapping("/logout")
    public String logout(HttpServletResponse response) {

        Cookie cookie = new Cookie("jwtToken", null);
        cookie.setMaxAge(0);
        cookie.setPath("/");
        response.addCookie(cookie);
        token = null;
        return "login";
    }
    public boolean isJwtToken(String token) {
        // Vérifie si la chaîne contient deux points
        return token != null && token.split("\\.").length == 3;
    }

    public void iniatilzeToken(Cookie[] cookies) {
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("jwtToken")) {
                    token = cookie.getValue();
                    break;
                }
            }
        }
    }

}

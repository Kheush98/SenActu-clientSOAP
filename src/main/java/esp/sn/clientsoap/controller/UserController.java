package esp.sn.clientsoap.controller;

import esp.sn.clientsoap.model.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import jakarta.servlet.http.Cookie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import proxy.*;


@Controller
public class UserController {

    UserService proxy = new UserWS().getUserServicePort();
    String token;
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
        if (errors.hasErrors()) {
            return "login";
        }
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

    public boolean isJwtToken(String token) {
        // Vérifie si la chaîne contient deux points
        return token != null && token.split("\\.").length == 3;
    }

    @GetMapping("/users/{username}")
    public String updateForm(@PathVariable("username") String username, Model model, HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        this.iniatilzeToken(cookies);

        if (token == null){
            model.addAttribute("error", "Veuillez vous authentifier d'abord");
            return "redirect:/login";
        }
        model.addAttribute("user", proxy.userByUsername(username, token));
        return "edit";
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

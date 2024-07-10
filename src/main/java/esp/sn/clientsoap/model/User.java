package esp.sn.clientsoap.model;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class User {

    private long id;
    @NotNull
    private String username;
    @NotNull
    private String password;
    @NotNull
    private String role;
}

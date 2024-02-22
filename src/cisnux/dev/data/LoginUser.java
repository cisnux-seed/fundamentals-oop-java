package cisnux.dev.data;

import cisnux.dev.annotations.NotBlank;
import cisnux.dev.annotations.NotNull;

public record LoginUser(
        @NotBlank
        @NotNull String username,
        @NotBlank
        @NotNull String password
) {
    // field is not allowed in record class
    //    String email;

    public LoginUser {
        System.out.println("constructor has been called");
    }

    public LoginUser() {
        this(null, null);
    }

    public LoginUser(String username) {
        this(username, null);
    }
}

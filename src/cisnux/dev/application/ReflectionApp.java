package cisnux.dev.application;

import cisnux.dev.data.LoginUser;

import static cisnux.dev.utils.ValidationUtil.validateReflection;

public class ReflectionApp {
    public static void main(String[] args) {
        final var loginUser = new LoginUser("", "124902349");
        validateReflection(loginUser);
    }
}

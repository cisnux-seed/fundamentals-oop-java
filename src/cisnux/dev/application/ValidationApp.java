package cisnux.dev.application;

import cisnux.dev.data.LoginUser;

import static cisnux.dev.utils.ValidationUtil.*;

public class ValidationApp {
    public static void main(String[] args) {
        // these two below examples will be resulting same results

//        try {
//            final var loginUser = new LoginUser("123");
//            validate(loginUser);
//        } catch (ValidationException e) {
//            System.out.println("Validation Error: " + e.getMessage());
//        } catch (NullPointerException e) {
//            System.out.println("Null Error: " + e.getMessage());
//        } finally {
//            System.out.println("Done");
//        }

//        try {
//            final var loginUser = new LoginUser("123");
//            validate(loginUser);
//        } catch (ValidationException | NullPointerException exception) {
//            System.out.println("Error: " + exception.getMessage());
//        } finally {
//            System.out.println("Done");
//        }

        final var loginUser = new LoginUser("fajra", "2134534654");
        validateRuntime(loginUser);
        System.out.println(loginUser);

        final var loginUser1 = new LoginUser("2134534654");
//        will throw new NullPointerException
//        use try-catch to handle exception
        validateRuntime(loginUser1);
        System.out.println(loginUser);
    }
}

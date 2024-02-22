package cisnux.dev.data;

public class LoginApp {
    public static void main(String[] args) {
        final var login = new LoginUser("fajra", "fajra123");
        final var login1 = new LoginUser("fajra", "fajra123");
        final var login3 = new LoginUser("fajra");
        final var login4 = new LoginUser();
        final var login5 = new LoginUser();
        System.out.println(login);
        System.out.println(login1);
        System.out.println(login5);
        System.out.println(login.equals(login1));
        System.out.println(login4.equals(login5));
    }
}

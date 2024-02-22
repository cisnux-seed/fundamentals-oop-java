package cisnux.dev.application;

import cisnux.dev.data.*;

public class Application {
    public static void main(String[] args) {
        final var product = new Product("Hoodie", 20_000);
        System.out.println(product);
        final var user = new User("1", "fajra");
        System.out.println(user);
        // it wouldn't be working bcs this file is located in different package
//        System.out.println(product.name);
//        System.out.println(product.price);
    }
}

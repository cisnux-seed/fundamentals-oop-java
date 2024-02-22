package cisnux.dev.application;

import cisnux.dev.data.Customer;
import cisnux.dev.data.Level;

import java.util.Arrays;

import static cisnux.dev.data.Level.*;

public class CustomerApp {
    public static void main(String[] args) {
        final var customer = new Customer("John", PREMIUM);
        System.out.println(customer);
        System.out.println(customer.level().name());
        System.out.println(Level.valueOf("VIP") == VIP);
        final var levels = Level.values();
        System.out.println(Arrays.toString(levels));
    }
}

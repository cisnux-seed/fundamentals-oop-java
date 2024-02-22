package cisnux.dev.data;

public class ProductApp {
    public static void main(String[] args) {
        // same package
        final var product = new Product("Hoodie", 20000);
        System.out.println(product);
        System.out.println(product.name);
        System.out.println(product.price);
        final var product1 = new Product("Hoodie", 20000);
        System.out.println(product.equals(product1));
        System.out.println(product1.hashCode() == product.hashCode());
    }
}

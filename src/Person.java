public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    Person(String name) {
        this(name, null);
    }

    Person() {
        this(null);
    }

    void sayHello(String to) {
        System.out.println("Hello " + to + " from " + name);
    }
}

public class Manager extends Employee {
    String company;

    Manager(String name) {
        super(name);
    }

    Manager(String name, String company) {
        super(name);
        this.company = company;
    }

    void sayHello(String to) {
        System.out.println("Hello " + to + " from Manager - " + this.name);
    }
}

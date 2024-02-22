public class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void sayHello(String to) {
        System.out.println("Hello " + to + " from Employee - " + this.name);
    }
}

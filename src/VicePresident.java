public class VicePresident extends Manager {
    VicePresident(String name) {
        super(name, null);
    }

    void sayHello(String to) {
        System.out.println("Hello " + to + " vice president - " + this.name);
    }

    String getDepartmentName() {
        return "technical";
    }
}

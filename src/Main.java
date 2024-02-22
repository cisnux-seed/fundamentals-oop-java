import cisnux.dev.data.Product;

public class Main {
    public static void main(String[] args) {
        final var person1 = new Person();
        person1.name = "John";
        person1.address = "Jambi";
        System.out.println(person1.name + " " + person1.address + " " + person1.country);
        person1.name = "Jack";
        System.out.println(person1.name + " " + person1.address + " " + person1.country);
        person1.sayHello("Fajrul");
        final var person2 = new Person("Jay", "Bandung");
        System.out.println(person2.name + " " + person2.address + " " + person2.country);
        final var person3 = new Person("Jack");
        System.out.println(person3.name + " " + person3.address + " " + person3.country);

        final var manager = new Manager("Jack");
        manager.sayHello("fajrul");
        final var vp = new VicePresident("Dick");
        vp.sayHello("fajrul");
        System.out.println(vp.company);

        final var rectangle = new Rectangle();
        System.out.println("corner from parent " + rectangle.getParentCorner());
        System.out.println("corner from child " + rectangle.getCorner());

        final Manager person4 = new VicePresident("Bill");
        System.out.println(person4.name);
        System.out.println(person4.company);

        hello(manager);
        hello(vp);

        Child child = new Child();
        child.name = "Ray";
        // Do it from child
        child.doIt();
        // Ray
        System.out.println(child.name);

        // casting
        Parent parent = child;
        parent.name = "ry";
        // Do it from child
        parent.doIt();
        // null
        System.out.println(parent.name);
//        final var product = new Product("product1", 20000);
//        System.out.println(product);
    }

    static void hello(Employee employee) {
        if (employee instanceof VicePresident vp)
            System.out.println("Hello " + vp.name + " from " + vp.getDepartmentName());
        else System.out.println(employee.name);
    }
}
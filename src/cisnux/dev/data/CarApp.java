package cisnux.dev.data;

public class CarApp {
    public static void main(String[] args) {
        final var car = new BMW();
        car.drive();
        System.out.println(car.getTires());
        System.out.println(car.getBrand());
        System.out.println(car.isMaintenance());
    }
}

package cisnux.dev.data;

public class BMW implements Car, IsMaintenance {
    public void drive() {
        System.out.println("driving a car");
    }

    public int getTires() {
        return 4;
    }

    public boolean isBig() {
        return true;
    }

    public String getBrand() {
        return "BMW I8";
    }

    public boolean isMaintenance() {
        return true;
    }
}

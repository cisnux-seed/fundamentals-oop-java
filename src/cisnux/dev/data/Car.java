package cisnux.dev.data;

public interface Car extends HasBrand {
    void drive();

    int getTires();

    default boolean isBig() {
        return false;
    }
}
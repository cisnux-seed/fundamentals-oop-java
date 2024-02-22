package cisnux.dev.data;

public enum Level {
    STANDARD("Standard Edition"),
    PREMIUM("Premium Edition"),
    VIP("VIP Edition"),;

    final String description;

    Level(String description) {
        this.description = description;
    }
}

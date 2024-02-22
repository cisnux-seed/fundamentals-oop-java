package cisnux.dev.utils;

public class Application {
    static final int PROCESSORS;

    static {
        System.out.println("Processors");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}

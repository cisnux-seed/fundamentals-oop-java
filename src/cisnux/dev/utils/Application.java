package cisnux.dev.utils;

public class Application {
    static final int PROCESSORS;

    static {
        PROCESSORS = Runtime.getRuntime().availableProcessors();
        System.out.printf("Processors %d\n", PROCESSORS);
    }
}

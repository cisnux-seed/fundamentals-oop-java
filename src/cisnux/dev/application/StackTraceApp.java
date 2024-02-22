package cisnux.dev.application;

public class StackTraceApp {
    public static void main(String[] args) {
        try {
            sampleError();
        }catch (Throwable e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getCause().getMessage());
        }
    }

    public static void sampleError() throws Throwable {
        try {
            final var names = new String[]{
                    "jack", "john", "duck"
            };
            System.out.println(names[100]);
        }catch (Throwable throwable){
            throw new Throwable(throwable);
        }
    }
}

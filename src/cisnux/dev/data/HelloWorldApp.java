package cisnux.dev.data;

public class HelloWorldApp {
    public static void main(String[] args) {
        final HelloWorld english = new HelloWorld() {
            @Override
            public void greeting() {
                System.out.println("Hello World");
            }

            @Override
            public void greeting(String name) {
                System.out.println("Hello " + name);
            }
        };
        final HelloWorld indonesia = new HelloWorld() {

            @Override
            public void greeting() {
                System.out.println("Halo Dunia");
            }

            @Override
            public void greeting(String name) {
                System.out.println("Halo " + name);
            }
        };
        english.greeting();
        indonesia.greeting();
    }
}

package cisnux.dev.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryResourceApp {
    public static void main(String[] args) {
        // manually
//        BufferedReader reader = null;
//        try {
//            reader = new BufferedReader(new FileReader("README.md"));
//            while (true) {
//                final var line = reader.readLine();
//                if (line == null)
//                    break;
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException ex) {
//                    ex.printStackTrace();
//                }
//            }
//        }

        // automatically, could be done by try with resource
        try (BufferedReader reader = new BufferedReader(new FileReader("README.md"));) {
            for (var line = reader.readLine(); line != null; line = reader.readLine()) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package cisnux.dev.utils;

public class MathUtil {
    public static int sum(int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        return total;
    }
}

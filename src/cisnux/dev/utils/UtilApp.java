package cisnux.dev.utils;

import static cisnux.dev.utils.Application.PROCESSORS;
import static cisnux.dev.utils.Constant.*;
import static cisnux.dev.utils.MathUtil.sum;

public class UtilApp {
    public static void main(String[] args) {
        System.out.println("from " + PROCESSORS);

        System.out.println(VERSION);
        System.out.println(APPLICATION_NAME);

        System.out.println(sum(1, 2, 3, 4, 5));

        Country.City city = new Country.City();
        city.setName("tokyo");
        System.out.println(city.getName());
    }
}

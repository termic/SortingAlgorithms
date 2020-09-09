package com.teashurov.algo.commons;

import java.util.Arrays;

public class Printer {
    public static void printObj(Object object) {
        if (object instanceof int[]) {
            Arrays.stream((int[]) object).forEach(System.out::println);
        } else {
            System.out.println(object);
        }
    }
}

package com.math;

import java.util.function.Function;

public class FunctionRunner {
    public static void main(String[] args) {
        Function<String, String> upperCasePrinter = text -> {
            System.out.println(text.toUpperCase());
            return text;
        };

        execute("Tantia tope", upperCasePrinter);

        String type = "upper";
        decidePrinter(type).apply("Tantia tope");


    }

    public static String execute(String text, Function<String, String> function) {
        return function.apply(text);
    }

    private static String print(String text) {
        System.out.println(text);
        return text;
    }
    private static String printLower(String text) {
        System.out.println(text.toLowerCase());
        return text;
    }
    private static String printUpper(String text) {
        System.out.println(text.toUpperCase());
        return text;
    }

    private static Function<String, String> decidePrinter(String type) {
        return switch (type) {
            case "normal" -> FunctionRunner::print;
            case "upper" -> FunctionRunner::printUpper;
            case "lower" -> FunctionRunner::printLower;
            default -> null;
        };
    }
}

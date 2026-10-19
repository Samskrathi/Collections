package com.exceptions;

public class DivideRunner {

    public static void main(String[] args) {

        int res= divide(1, 0);
        System.out.println(res);


    }

    @Deprecated
    private static int divide(int dividend, int devisor) {
        try {
            return dividend/ devisor;

        } catch (ArithmeticException e) {
            System.out.println("Divison by zero");
            return 0;
        } finally {
            System.out.println("Good bye");
        }

    }
}

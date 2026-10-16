package com.math;

public class Runner {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a+b;
        MathOperation sub = (a,b) -> a-b;

        System.out.println(add.operate(1, 2));
        System.out.println(sub.operate(2, 2));

        System.out.println(calculate(1, 5, add));

    }

    public static int calculate(int a, int b, MathOperation operation) {
        return operation.operate(a, b);


    }


}

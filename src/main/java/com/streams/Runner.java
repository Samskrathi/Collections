package com.streams;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2 ,5, 7, 8, 9);

        for (Integer i : numbers) {
            System.out.print(i+" ");
        }
        System.out.println();


        numbers.stream()
                .forEach(a-> System.out.print(a +" "));

        System.out.println();

        question7();


    }

    private static void question1() {
        List<Integer> numbers = List.of(1,2 ,5, 7, 8, 9);

        numbers.stream()
                .map(a-> a*a) //no change in the length .., intermediate operation
                .forEach(System.out::print); //terminal operation

    }

    private static void question2() {
        List<Integer> numbers = List.of(1,2 ,5, 7, 8, 9);

        numbers.stream()
                .filter(a-> a%2==0)  //change in the size .., intermediate operation
                .forEach(System.out::print); //terminal operation

    }

    private static void question3() {
        //find all even numbers
        List<Integer> numbers = List.of(1,2 ,5, 7, 8, 9);

        List<Integer> evenNumbers = numbers.stream()
                .filter(a-> a%2==0)  //intermediate operation
                .toList(); //terminal operation

        System.out.println(evenNumbers);

    }

    private static void question4() {
        //find all even numbers and get square
        List<Integer> numbers = List.of(1,2 ,5, 7, 8, 9);

        List<Integer> evenSquareNumbers = numbers.stream()
                .filter(a-> a%2==0)  //intermediate operation
                .map(a-> a*a) //intermediate operation
                        .toList(); //terminal operation


        System.out.println(evenSquareNumbers);

    }

    private static void question6() {
        //find all length names
        List<String> names = List.of("sam", "mina", "tina", "chaya");

        List<Integer> nameLength = names.stream()
                .map(String::length) //intermediate operation
                .toList(); //terminal operation


        System.out.println(nameLength);

    }

    private static void question7() {
        List<Integer> numbers = List.of(1,2 ,5, 7, 8, 9);

        Integer sum = numbers.stream()
                        .reduce(0, (currSum, currVal)-> { //terminal operation
                            System.out.println(currSum+ " ...." + currVal);
                            return currSum + currVal;
                        });


        System.out.println(sum);

    }


}

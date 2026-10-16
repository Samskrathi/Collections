package com.collections;

import java.util.*;

public class Runner {

    public static void main(String[] args) {

        Pairs<Integer> id1 = new Pairs<>(2, 2);
        Pairs<Integer> id2 = new Pairs<>(1, 200);

        List<Pairs<Integer>> ids = Arrays.asList(id1, id2);

        List<Integer> example = new ArrayList<>(List.of(5, 2, 8, 1));
        Collections.sort(example);
        System.out.println(example);

        Collections.sort(ids);

        for (Pairs<Integer> pair : ids) {
            System.out.println(pair.getFirst()+" " +pair.getSecond());
        }



    }
}

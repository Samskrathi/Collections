package com.collections;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetRunner {

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(30);
        treeSet.add(100);
        treeSet.add(100);

        TreeSet<Integer> treeSet1 = new TreeSet<>(Collections.reverseOrder());
        treeSet1.add(30);
        treeSet1.add(100);


        for(Integer val: treeSet) {
            System.out.println(val);
        }

        for(Integer val: treeSet1) {
            System.out.println(val);
        }
        System.out.println(treeSet.floor(200));


    }
}

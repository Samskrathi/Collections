package com.collections;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collection;

@Getter
@AllArgsConstructor
public class Pairs<TYPE extends Comparable<TYPE>> implements Comparable<Pairs<TYPE>>{

    private TYPE first;

    private TYPE second;

    @Override
    public int compareTo(Pairs<TYPE> pair) {
        return first.compareTo(pair.first);
    }

}

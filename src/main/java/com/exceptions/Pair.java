package com.collections;

import com.exceptions.NullValueException;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class Pair<LEFT_TYPE, RIGHT_TYPE> {

    private LEFT_TYPE first;

    private RIGHT_TYPE second;

    public Pair(LEFT_TYPE first, RIGHT_TYPE second) {
        if(first == null || second == null) {
            throw new NullValueException();
        }
        this.first = first;
        this.second = second;
    }



}

package com.exceptions;

public class NullValueException extends RuntimeException{

    public NullValueException() {
        super("Null values are not allowed");
    }
}

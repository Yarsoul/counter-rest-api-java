package com.counter.exception;

public class NoSuchCounterException extends RuntimeException{
    public NoSuchCounterException (String message) {
        super(message);
    }
}

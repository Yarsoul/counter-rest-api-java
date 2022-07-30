package com.counter.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@ControllerAdvice
public class CounterExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<CounterIncorrectData> handleException (NoSuchCounterException exception) {
        CounterIncorrectData data = new CounterIncorrectData();
        data.setInfo(exception.getMessage());

        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }


}

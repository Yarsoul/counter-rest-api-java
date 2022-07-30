package com.counter.request_body;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;


public class RequestIncrement {

    @Pattern(regexp = "\\d{1,10}")
    private String counterId;

    @Min(1)
    private int incrementCount;

    public RequestIncrement() {
    }

    public RequestIncrement(String counterId, int incrementCount) {
        this.counterId = counterId;
        this.incrementCount = incrementCount;
    }

    public String getCounterId() {
        return counterId;
    }

    public void setCounterId(String counterId) {
        this.counterId = counterId;
    }

    public int getIncrementCount() {
        return incrementCount;
    }

    public void setIncrementCount(int incrementCount) {
        this.incrementCount = incrementCount;
    }
}

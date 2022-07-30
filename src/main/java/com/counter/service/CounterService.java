package com.counter.service;

import com.counter.entity.Counter;

import java.util.List;

public interface CounterService {
    public List<Counter> getAllCounters();

    public Counter getCounterById(int id);

    public void updateCount(Counter counter);

}

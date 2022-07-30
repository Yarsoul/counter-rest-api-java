package com.counter.repository;

import com.counter.entity.Counter;

import java.util.List;

public interface CounterRepository {

    public List<Counter> getAllCounters();

    public Counter getCounterById(int id);

    public void updateCount(Counter counter);


}

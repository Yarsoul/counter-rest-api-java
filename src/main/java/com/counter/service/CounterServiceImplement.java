package com.counter.service;

import com.counter.entity.Counter;
import com.counter.repository.CounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CounterServiceImplement implements CounterService{

    @Autowired
    private CounterRepository counterRepository;

    @Override
    @Transactional
    public List<Counter> getAllCounters() {
        return counterRepository.getAllCounters();
    }

    @Override
    @Transactional
    public Counter getCounterById(int id) {
        return counterRepository.getCounterById(id);
    }

    @Override
    @Transactional
    public void updateCount(Counter counter) {
        counterRepository.updateCount(counter);
    }
}

package com.counter.repository;

import com.counter.entity.Counter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class CounterRepositoryImplement implements CounterRepository{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Counter> getAllCounters() {
        Query query = entityManager.createQuery("from Counter");
        List<Counter> allCounters = query.getResultList();
        return allCounters;
    }

    @Override
    public Counter getCounterById(int id) {
        Counter counter = entityManager.find(Counter.class, id);
        return counter;
    }

    @Override
    public void updateCount(Counter counter) {
        Counter updateCounter = entityManager.merge(counter);
        updateCounter.getCount();
    }
}

package com.counter.controller;

import com.counter.entity.Counter;
import com.counter.exception.NoSuchCounterException;
import com.counter.request_body.RequestIncrement;
import com.counter.service.CounterService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api")
@Tag(name="Основной контроллер", description="управляет всеми действиями")
public class MyRestController {

    @Autowired
    private CounterService counterService;

    @GetMapping("/counters")
    @Operation(summary = "Показывает все счетчики")
    public List<Counter> showAllCounters() {
        List<Counter> counters = counterService.getAllCounters();
        return counters;
    }

    @GetMapping("/counter/{counterId}")
    @Operation(summary = "Поиск счетчика по id")
    public int getCounter(@PathVariable int counterId) {
        Counter counter = counterService.getCounterById(counterId);
        if (counter == null) {
            throw new NoSuchCounterException("Counter with id = " + counterId + " not found");
        }
        int count = counter.getCount();
        return count;
    }


    @PostMapping("/counter")
    @Operation(summary = "Изменение счетчика")
    public int updateCount(@Valid @RequestBody RequestIncrement requestIncrement) {
        String counterIdStr = requestIncrement.getCounterId();
        int counterId = Integer.parseInt(counterIdStr);
        Counter counter = counterService.getCounterById(counterId);
        if (counter == null) {
            throw new NoSuchCounterException("Counter with id = " + counterId + " not found");
        }
        int newCount = requestIncrement.getIncrementCount();
        counter.setCount(newCount);
        counterService.updateCount(counter);

        return newCount;
    }
}

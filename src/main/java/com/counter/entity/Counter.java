package com.counter.entity;

import javax.persistence.*;

@Entity
@Table(name = "counter")
public class Counter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "count")
    private int count;

    public Counter() {
    }

    public Counter(int id, String name, int count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }

//    public Counter(String name, int count) {
//        this.name = name;
//        this.count = count;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

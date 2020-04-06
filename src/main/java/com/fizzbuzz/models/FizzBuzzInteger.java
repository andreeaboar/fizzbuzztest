package com.fizzbuzz.models;

import javax.persistence.*;

@Entity
@Table(name = "FizzBuzzIntegers")
public class FizzBuzzInteger {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer integerValue;

    public FizzBuzzInteger() {
    }

    public FizzBuzzInteger(Integer id, Integer integerValue) {
        this.id = id;
        this.integerValue = integerValue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIntegerValue() {
        return integerValue;
    }

    public void setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
    }
}

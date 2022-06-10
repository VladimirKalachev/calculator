package com.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalcService {

    public int add(Integer a, Integer b) {
        return a + b;
    }

    public int substr(Integer a, Integer b) {
        return a - b;
    }

    public int multiply(Integer a, Integer b) {
        return a * b;
    }

    public double divide(Integer a, Integer b) {

        double result = (double) a / b;

        return result;
    }

}

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
        return (double) a / b;
    }

    //advanced
    public int fact(Integer c) {
        int result = 1;
        for (int i = 1; i <= c; i++) {
            result *= i;
        }
        return result;
    }

    public double sqrt(Integer c) {
        return Math.sqrt(c);
    }

    public double power(Integer a, Integer b) {
        double ad = (double) a;
        double bd = (double) b;
        return Math.pow(ad, bd);
    }

}

package com.calculator.service;

import com.calculator.model.CalcModel;
import org.springframework.stereotype.Service;

@Service
public class CalcService {

    public int add(CalcModel model) {
        return model.getA() + model.getB();
    }

    public int subtr(CalcModel model) {
        return model.getA() - model.getB();
    }

    public int multiply(CalcModel model) {
        return model.getA() * model.getB();
    }

    public double divide(CalcModel model) {
        if (model.getA() == 0) return 0;
        if (model.getB() == 0) return 0;
        return (double) model.getA() / model.getB();
    }

}

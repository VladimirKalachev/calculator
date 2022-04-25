package com.calculator.model;

public class CalcModel {

    private String operation;
    private int a;
    private int b;
    private int c;

    public CalcModel() {
    }

    public CalcModel(int c) {
        this.c = c;
    }

    public CalcModel(String operation) {
        this.operation = operation;
    }

    public CalcModel(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}

package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class ControllerService {
    public void nothin(){
        System.out.println();
    }
    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double mul(double a, double b) {
        return a * b;
    }
    public double div(double a, double b) {
        return a / b;
    }

}

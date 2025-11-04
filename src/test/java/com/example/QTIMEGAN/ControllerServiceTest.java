package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControllerServiceTest {

    private final ControllerService controllerService = new ControllerService();

    @Test
    void testAdd() {
        double result = controllerService.add(10, 5);
        assertEquals(15, result, "Addition failed");
    }
    @Test
    void testSubtract() {
        double result = controllerService.subtract(10, 5);
        assertEquals(5, result, "Subtraction failed");
    }
    @Test
    void testMultiply() {
        double result = controllerService.mul(10, 5);
        assertEquals(50, result, "Multiplication failed");
    }
    @Test
    void testDivide() {
        double result = controllerService.div(10, 5);
        assertEquals(2, result, "Division failed");
    }


}

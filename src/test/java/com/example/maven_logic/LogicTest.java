package com.example.maven_logic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LogicTest {

    @Test
    public void testProcessData_WithNullInput() {
        Logic logic = new Logic();
        String result = logic.processData(null);
        assertEquals("No input provided", result);
    }

    @Test
    public void testProcessData_WithValidInput() {
        Logic logic = new Logic();
        String result = logic.processData("abc123!");
        assertEquals("ABC234! - Comm", result); // Updated expected result
    }

    @Test
    public void testCalculateSum() {
        Logic logic = new Logic();
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = logic.calculateSum(numbers);
        assertEquals(15, sum);
    }
}
package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.calculator.String_Calculator;

class String_calculator_test {
	
	@Test
    void empty_string_should_return_0() {
        String_Calculator stringCalculator = new String_Calculator();
        assertEquals(0, stringCalculator.add(""));
    }
	

}

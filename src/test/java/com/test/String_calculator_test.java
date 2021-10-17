package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.calculator.String_Calculator;

class String_calculator_test {
	
	@Test
    void empty_string_return_0() {
        String_Calculator stringCalculator = new String_Calculator();
        assertEquals(0, stringCalculator.add(""));
    }
	
	@Test
    void single_number() {
        String_Calculator stringCalculator = new String_Calculator();
        assertEquals(1, stringCalculator.add("1"));
    }
	

}

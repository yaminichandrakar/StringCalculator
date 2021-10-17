package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.calculator.String_Calculator;

class String_calculator_test {
	 String_Calculator stringCalculator = new String_Calculator();
     
	
	@Test
    void empty_string_return_0() {
        assertEquals(0, stringCalculator.add(""));
    }
	
	@Test
    void single_number() {
        assertEquals(1, stringCalculator.add("1"));
    }
	
	@Test
    void single_number_2() {
		assertEquals(2, stringCalculator.add("2"));
           }
	
	@Test
    void add_two_number() {
		assertEquals(5, stringCalculator.add("2,3"));  
    }
	
	@Test
    void add_three_number() {
		assertEquals(15, stringCalculator.add("2,3,10"));  
    }
	
	@Test
    void add_many_number() {
		assertEquals(40, stringCalculator.add("2,3,10,20,5,0"));  
    }
	
	@Test
    void using_newline_and_comma() {
		assertEquals(10, stringCalculator.add("2\n3,5"));  
    }
	
	@Test
    void using_comma_and_newline() {
		assertEquals(10, stringCalculator.add("2,3\n5"));  
    }
	
	@Test
    void using_newlineonly() {
		assertEquals(20, stringCalculator.add("2\n3\n5\n10"));  
    }

	@Test
    void numbergraterthan1k_test1() {
		assertEquals(2, stringCalculator.add("2,1002"));  
    }
	
	@Test
    void numbergraterthan1k_test2() {
		assertEquals(2, stringCalculator.add("2,1002\n1003"));  
    }
	
	@Test
    void numbergraterthan1k_test3() {
		assertEquals(0, stringCalculator.add("1003,1002"));  
    }
	
	@Test
    void negativeno_test1() {
		stringCalculator.add("-3,2");  
    }
	
	@Test
    void negativeno_test2() {
		stringCalculator.add("3,-2");  
    }
	
	@Test
    void negativeno_test3() {
		stringCalculator.add("-3,-5,-2,-10");  
    }
	
	@Test
    void diff_delimiter_test1() {
		assertEquals(3, stringCalculator.add("//[x]\n2x1"));  
	    
    }
	
	@Test
    void diff_delimiter_test2() {
		assertEquals(6, stringCalculator.add("//[x][y]\n1x2y3"));  
	    
    }
	
	@Test
    void diff_delimiter_test3() {
		assertEquals(6, stringCalculator.add("//[xx][yy]\n1xx2yy3"));  
	    
    }
}

package com.calculator;
import com.calculator.Calculate;

public class String_Calculator {
	
	public int add(String input) {
		Calculate cal=new Calculate(input);
		return cal.add();
	}

}

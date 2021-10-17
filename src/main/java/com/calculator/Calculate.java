package com.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculate {

	private final String input;
	private String delimiter = "[,\n]";
	private String numberwithdelimiter;
	private List<String> negativeno = new ArrayList<String>();

	public Calculate(String input) {
		super();
		this.input = input;
	}

	public int add() {
		if (isEmpty()) {
			return 0;
		}
		return 1;

	}

	private boolean isEmpty() {
		return input.length() == 0;
	}
}

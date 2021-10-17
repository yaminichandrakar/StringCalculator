package com.calculator;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

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
		FindLineWithNumbersAndDelimiters();
        String[] SplittedByDelimiter = splitInputByDelimiter();
        return calculateSum(SplittedByDelimiter);

	}

	private boolean isEmpty() {
		return input.length() == 0;
	}
	
	private void FindLineWithNumbersAndDelimiters() {
        if (hasCustomDelimiter()) {
            parseDelimiter();
            findLineWithNumbersAndDelimiters();
        } else {
        	numberwithdelimiter = input;
        }
    }
	
	 private boolean hasCustomDelimiter() {
         return input.startsWith("//");
     }


     private void findLineWithNumbersAndDelimiters() {
         int firstNewLine = input.indexOf("\n");
         numberwithdelimiter = input.substring(firstNewLine + 1);
     }

     private void parseDelimiter() {
         delimiter = "";
         addDelimiters();
         delimiter = StringUtils.chop(delimiter);
     }
     

     private void addDelimiters() {
         int startIndexDelimiter = 0;
         while (true) {
             startIndexDelimiter = input.indexOf("[", startIndexDelimiter) + 1;
             if (startIndexDelimiter == 0) {
                 break;
             }
             int endIndexDelimiter = input.indexOf("]", startIndexDelimiter);
             delimiter += input.substring(startIndexDelimiter, endIndexDelimiter) + "|";
         }
     }

     private String[] splitInputByDelimiter() {
         return numberwithdelimiter.split(delimiter);
     }

     private int calculateSum(String[] inputSplittedByDelimiter) {
         int result = 0;
         for (String token : inputSplittedByDelimiter) {
             result += addSingleToken(token);
         }
         IfNegativeNumberExist();
         return result;
     }

     private void IfNegativeNumberExist() {
         if (hasNegativenumber()) {
             throw new IllegalArgumentException(String.format("negatives not allowed (%s)", StringUtils.join(negativeno, ",")));
         }
     }

     private boolean hasNegativenumber() {
         return negativeno.size() > 0;
     }

     private int addSingleToken(String token) {
         Integer value = Integer.parseInt(token);
         if (isNegative(value)) {
        	 negativeno.add(token);
         } else if (isInValidRange(value)) {
             return value;
         }
         return 0;
     }

     private boolean isNegative(Integer value) {
         return value < 0;
     }

     private boolean isInValidRange(Integer value) {
         return value < 1000;
     }
	
}

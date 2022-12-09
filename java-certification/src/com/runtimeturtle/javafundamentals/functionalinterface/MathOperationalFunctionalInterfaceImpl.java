package com.runtimeturtle.javafundamentals.functionalinterface;

/**
 * A Class to Demonstrate multi-line
 * code block of functional interface
 *
 * @author pandeys3
 */
public class MathOperationalFunctionalInterfaceImpl {

	public static void main(String[] args) {
		
		int x = 5, y = 10;
		
		int bigger = performOperation((a, b) -> {
			if(x > y)
				return x;
			else
				return y;
		});
		
		int sum = performOperation((a, b) -> {
			return x + y;
		});
		
		System.out.println("Message #01 : Bigger Number is - "+ bigger);
		System.out.println("Message #02 : Sum of the Numbers is - "+ sum);
	}
	
	public static int performOperation(MathOperationalFunctionalInterface f) {
		return f.operation(0, 0);
	}
}

package com.runtimeturtle.javafundamentals.functionalinterface;

/**
 * A Simple Functional Interface Implementation
 *
 * @author pandeys3
 */
public class BasicFunctionaInterfaceImpl {

	public static void main(String[] args) {
		String s = "This is Lambda Message";
		printMessageThroughLambda(() -> s.toLowerCase());
	}

	public static void printMessageThroughLambda(BasicFunctionalInterface f) {
		System.out.println("Message #01 : " + f.lambdaMethod());
	}
}

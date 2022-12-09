package com.runtimeturtle.javafundamentals.functionalinterface;

import java.util.ArrayList;
import java.util.List;

/**
 * A Class to Demonstrate the Parameterized
 * Functional Interface Implementation
 *
 * @author runtime-turtle
 */
public class ListOperationFunctionalInterfaceImpl {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Ram");
		names.add("Lakshaman");
		names.add("Bharat");
		names.add("Shatrughan");
		names.add("Hanuman");
		
		String shri  = "Shri";
		
		executeOnList(names, shri, (u, s) -> u + " " + s.toLowerCase());
		executeOnList(names, shri, (u, s) -> u + " " + s.toUpperCase());
		
	}
	
	static void executeOnList(List<String> names, String shri, ListOperationFunctionalInterface<String> f) {
		for(String name : names) {
			System.out.println(f.execute(shri, name));
		}
	}
}

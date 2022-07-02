package com.set;

import java.util.HashSet;
import java.util.Set;

public class Set1 {
	public static void main(String[] args) {
		Set<Integer> number = new HashSet<>();
		number.add(7654321);
		number.add(765432);
		number.add(76543);
		number.add(7654);
		number.add(765);
		number.add(76);
		number.add(7);
		
		System.out.println(number);
		
	}
}

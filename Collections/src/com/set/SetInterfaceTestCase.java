package com.set;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceTestCase {
	public static void main(String[] args) {
		Set<String> set = Set.of("Apple","Ball","cat");
		//set.add("Apple");
		Set<String> hashset = new HashSet<>(set);
		hashset.add("Dog");
		
	}
}

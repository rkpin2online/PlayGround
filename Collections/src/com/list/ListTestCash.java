package com.list;

import java.util.List;

public class ListTestCash {

	public static void main(String[] args) {
		
		List<String> words = List.of("Apple","Bat","Cat");
		System.out.println(words.size());
		System.out.println(words.isEmpty());
		System.out.println(words.get(0));
		System.out.println(words.contains("Dog"));
		System.out.println(words.indexOf("Cat"));
		System.out.println(words.indexOf("Ant"));
		System.out.println(words.indexOf("Ant"));
	}

}

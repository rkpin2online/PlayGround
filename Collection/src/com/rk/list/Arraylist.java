package com.rk.list;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		words.add("Apple");
		words.add("Ball");
		words.add("Cat");
		
		
		words.add(3, "Dog");
		
		System.out.println(words);
	}
}

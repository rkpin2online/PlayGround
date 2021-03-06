package com.rk.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {
		List<String> words = List.of("Apple","Ball","Cat");
		
		for (String word : words) {
			System.out.println(word);
		}
		
		System.out.println(words.size()); 
		System.out.println(words.isEmpty());
		System.out.println(words.get(0));
		System.out.println(words.contains("Dog"));
		System.out.println(words.contains("Cat"));
		System.out.println(words.indexOf("Cat"));
		
		List<String> wordsArrayList = new ArrayList<>(words);
		List<String> wordsLinkedList = new LinkedList<>(words);
		List<String> wordsVector = new Vector<>(words);
		
		wordsArrayList.add("Dog");
		System.out.println(wordsArrayList);
		
		wordsLinkedList.add("Egg");
		System.out.println(wordsLinkedList);
		
		wordsVector.add("Frog");
		System.out.println(wordsVector);
		
		
		
	}

}

package com.list;

import java.util.Iterator;
import java.util.List;

public class ListTest3 {
	public static void main(String[] args) {
		List<String> words = List.of("Apple","Ball","Cat","Dog","Elephant");
		
		for(int i=0;i<words.size();i++) {
			System.out.println(words.get(i));
		}
		
		System.out.println("=================================");
		
		for (String word : words) {
			 System.out.println(word);
		}
		System.out.println("++++++++++++++++++++++++++++++++");
		Iterator<String> wordsIterator = words.iterator();
		while(wordsIterator.hasNext()) {
			System.out.println(wordsIterator.next());
		}
	}
}

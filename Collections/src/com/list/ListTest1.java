package com.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTest1 {

	public static void main(String[] args) {
		
		List<String> words = List.of("Apple","Ball","Cat");
		
		List<String> wordsArrayList = new ArrayList<String>(words);
		System.out.println(wordsArrayList);
		
		List<String> wordsLinkedList = new LinkedList<String>(words);
		System.out.println(wordsLinkedList);
		
		List<String> wordsVector = new Vector<String>(words);
		System.out.println(wordsVector);
		
		wordsArrayList.add("Dog");
		System.out.println(wordsArrayList);
	}

}

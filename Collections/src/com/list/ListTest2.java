package com.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTest2 {
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
		
		wordsArrayList.add(2,"Bat");
		
		System.out.println(wordsArrayList);
		
		wordsArrayList.add("Elephant");
		wordsArrayList.add("Ball");
		System.out.println(wordsArrayList);
		
		List<String> newList = List.of("Yark","Zebra");
		wordsArrayList.addAll(newList);
		System.out.println(wordsArrayList);
		
		wordsArrayList.set(6,"Fish");
		System.out.println(wordsArrayList);
		
		wordsArrayList.remove(2);
		System.out.println(wordsArrayList);
		
		for(int i=0;i<wordsArrayList.size();i++) {
			System.out.println(wordsArrayList.get(i));
		}
		
	}
}

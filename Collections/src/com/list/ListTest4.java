package com.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest4 {

	public static void main(String[] args) {
		
		List<String> words = List.of("Apple","Ball","Cat","Dog","Elephant");
		List<String> wordAl = new ArrayList<>(words);
		
		for (String word:wordAl) {
			if(word.endsWith("at")){
				System.out.println(word);
			}
		}
	}

}

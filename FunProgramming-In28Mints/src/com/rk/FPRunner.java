package com.rk;

import java.util.List;

public class FPRunner {
	public static void main(String[] args) {
		List<String> lists = List.of("Apple","Banana","Cat","Dog");
		
		//printBasic(lists);
		printWithFP(lists);
		
	}

	public static void printBasic(List<String> lists) {
		for (String list : lists) {
			System.out.println(list);
		} 	
	}
	
	public static void printWithFP(List<String> lists) {
		lists.stream().forEach(e->System.out.println(e));
	}
}

package com.rk;

import java.util.List;

public class FPNumberRunner {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,8,4,5,10,32,43,53,23,34);
			numbers.stream().forEach(element->System.out.println(element));
			Integer sum = numbers.stream().reduce(0,(n1,n2)->n1+n2);
			System.out.println("Sum = "+sum);
	}
}

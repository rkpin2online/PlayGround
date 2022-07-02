package com.rk.list;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterf {

	public static void main(String[] args) {
		//HashSet :: Neither inserted order or Sorted order but Duplicate not allowed
		Set<Integer> numbers = new HashSet<>();
		numbers.add(987654321);
		numbers.add(98765432);
		numbers.add(9876543);
		numbers.add(987654);
		numbers.add(98765);
		numbers.add(9876);
		numbers.add(987);
		numbers.add(98);
		numbers.add(9);
		
		System.out.println("HashSet Result:"+numbers);
		
		//LinkedHashSet : It sorted in Sorted order but not in inserted order
		Set<Integer> number = new LinkedHashSet<Integer>();
		number.add(987654321);
		number.add(98765432);
		number.add(9876543);
		number.add(987654);
		number.add(98765);
		number.add(9876);
		number.add(987);
		number.add(98);
		number.add(9);
		
		System.out.println("LinkedHashSet Result:"+number);
		
		//TreeSet : It Stored in Sorted order but in inserted order
		Set<Integer> num = new TreeSet<Integer>();
		num.add(987654321);
		num.add(98765432);
		num.add(9876543);
		num.add(987654);
		num.add(98765);
		num.add(9876);
		num.add(987);
		num.add(98);
		num.add(9);
		
		System.out.println("TreeSet Result:"+num);
		
	}

}

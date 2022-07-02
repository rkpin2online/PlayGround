package com.rk.list;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurentMapRunner {

	public static void main(String[] args) {
		ConcurrentMap<Character, LongAdder> occurences = new ConcurrentHashMap<>();
		
		String str = "ABCD ABCD ABCD";
	}

}

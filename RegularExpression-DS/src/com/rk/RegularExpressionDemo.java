package com.rk;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {

	public static void main(String[] args) {
		int count = 0;
		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher("abbabbabba");
		while(m.find()) {
			count++;
			System.out.println(m.start()+"---"+m.end()+"---"+m.group());
		}
		System.out.println("The no of Occures"+count);
		
	}

}

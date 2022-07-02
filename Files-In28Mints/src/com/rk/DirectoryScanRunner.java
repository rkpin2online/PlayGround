package com.rk;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;

public class DirectoryScanRunner {


	public static void main(String[] args) throws IOException {
		
		Path currentDir = Paths.get(".");
		//Files.list(currentDir).forEach(System.out::println);
		
		Predicate<? super Path> predicate= path -> String.valueOf(path).contains(".java");

		Files.walk(currentDir, 2)
		.filter(predicate)
		.forEach(System.out::println);
		
	}

}

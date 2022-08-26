package com.arquitecturajava;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Principal7 {

	public static void main(String[] args) {

		try {
			Stream<Path> miStream= Files.walk(Paths.get("./src"));
			miStream
			.map(Path::toFile)
			.filter(File::isFile)
			.map(File::getName)
			.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
}

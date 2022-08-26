package com.arquitectura.test.escuela.ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

class FicheroTest {

	@Test
	void test() throws FileNotFoundException {
		
		List<String> lineas= new ArrayList<String>();
		
		Scanner scanner = new Scanner(new File("src/test/resources/testfixture.txt"));
		while (scanner.hasNextLine()) {
			
			String linea= scanner.nextLine();
			lineas.add(linea);
			
		}
		assertThat(7, equalTo(lineas.size()));
		
		
		
	}

}

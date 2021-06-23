package com.user;

import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortFileDistincltyTest {


//	@Test
//	void test() {
//		fail("Not Yet Implemented");
//	}

	
	
	private SortFileDistinclty obj = new SortFileDistinclty();
	String line;
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	ArrayList<Integer> n = new ArrayList<Integer>();
	

@Test
public void inputFile() throws IOException {



        n = obj.fileReading("input.txt");
	Assertions.assertEquals(n,obj.fileReading("input.txt"));

	//BufferedReader bufReader = new BufferedReader(new FileReader("C:\\Users\\AISHA\\Desktop\\equifax\\SortingApp\\input.txt"));
	//System.out.println(obj.fileReading("input.txt")); 
}	

	@Test
	public void finalResult() throws IOException {

//		// to save the inputs
//		List<Integer> inputList = Arrays.asList(6, 8, 1, 1, 9, 9, 22, 12, 45, 42, 45, 88, 100, 88, 66, 50, 4, 2, 3);
//		ArrayList<Integer> input = new ArrayList<Integer>();
//		input.addAll(inputList);
 
		numbers = obj.fileReading("input.txt");
		
		final ArrayList<Integer> sortedNumbers = new ArrayList<Integer>();
		
		numbers.stream().sorted().distinct().forEach(s -> sortedNumbers.add(s));
		 
		//System.out.println(numbers);
		
		Assertions.assertEquals(sortedNumbers, obj.sort(numbers));

	}

}

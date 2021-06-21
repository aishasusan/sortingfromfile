package com.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SortFileDistincltyTest {

	private SortFileDistinclty obj = new SortFileDistinclty();

	@Test
	public void finalResult() {

		//to save the outputs 
		List<Integer> outputList = Arrays.asList(1, 2, 3, 4, 6, 8, 9, 12, 22, 42, 45, 50, 66, 88, 100);
		ArrayList<Integer> output = new ArrayList<Integer>();
		output.addAll(outputList);

		//to save the inputs
		List<Integer> inputList = Arrays.asList(6, 8, 1, 1, 9, 9, 22, 12, 45, 42, 45, 88, 100, 88, 66, 50, 4, 2, 3);
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.addAll(inputList);

		Assertions.assertEquals(output, obj.sort(input));
		
	}

}

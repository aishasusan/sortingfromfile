package com.user;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortFileDistinclty {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// ArrayList string to hold the lines of input file

		String line;
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		// Creating BufferedReader to read the input file

		BufferedReader reader = new BufferedReader(new FileReader("input.txt"));

		// Reading all the lines of input file one by one and adding them into ArrayList

		while ((line = reader.readLine()) != null) {

			String[] arr = line.split(" ");

			for (int i = 0; i <= arr.length - 1; i++) {
				try {
					int no = Integer.parseInt(arr[i]);
					numbers.add(no);
				} catch (NumberFormatException e) {
					System.out.println("NUMBER FORMAT EXCEPTION");
				}
			}
		}
		ArrayList<Integer> result = sort(numbers);
		System.out.println("The result of operations are:\n"+result);
	}

	public static ArrayList<Integer>  sort(ArrayList<Integer> n) {

		System.out.println("Given input file: \n" + n);

		ArrayList<Integer> sortedNumbers = new ArrayList<Integer>();
		n.stream().sorted().distinct().forEach(s->sortedNumbers.add(s));    // to sort the input																							// of numbers
		System.out.println("The result of operations are:\n"+sortedNumbers);
		return sortedNumbers;

	}

}

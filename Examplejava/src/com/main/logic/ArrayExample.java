package com.main.logic;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = {5,2,3,5,3,4};
		
		Map<Integer,Long> occurances = Arrays.stream(array1).collect(Collector.groupingBy(Function.identity(),Collectors.counting()));
		int nonRepetedNumber = occurances.entrySet().stream().filter(v -> v.getValue=1).map(k -> k.getKey()).findFirst().get();
		
		
	}

}
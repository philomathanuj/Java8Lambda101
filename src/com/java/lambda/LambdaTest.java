package com.java.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaTest {
	
	public static void main(String[] args) throws InterruptedException {
		Integer[] a = {1,2,3,4,5,6,7,8,9,10};
		
		List<Integer> list = Arrays.asList(a);
		// intermediate operation terminal operations
		// filter : intermediate : to something after map: intermediate operations
		// forEach: termnial operation, reducue: terminal
		// fiter will always boolean condition
		//list.stream().filter // Predicate : functional interface for boolean conditions
		// map: transformation on each time: increment each item by 1, perform upper case on each item
		// collect: collect them into a new list
		// reduce: 1,2,3,4,5 sum = 0; sum = sum + arr[i]; sequence of numbers : output: single number: aggregate opreation: sum/avg/count
		// reduce((x,y)-> x+y
		// mapToInt
		list = list.stream().filter(i -> i > 5).collect(Collectors.toList()); // 2 operations
		list = list.stream().filter(i -> i > 5).map(i-> i+1).collect(Collectors.toList()); //3 operations
		Optional<Integer> sum = list.stream().filter(i -> i > 5).map(i-> i+1).reduce((x,y)-> x+y); // 3 operations
		System.out.println(sum.get());
		int sumx = list.stream().filter(i -> i > 5).map(i-> i+1).reduce(0,(x,y)-> x+y); // 3 operations
		System.out.println(sumx);
		list.forEach(item -> System.out.println(item)); //one operation
		Map<String,String> map = new HashMap<>();
		map.put("1","x");
		map.put("2","y");
		map.put("3","z");
		map.put("4","q");
		map.forEach((key,value) -> System.out.println(key+value));
		map.replaceAll((x,y) -> x = x+1);
		map.forEach((key,value) -> System.out.println(key+value));
		List<List<String>> listx = new ArrayList<List<String>>();
		List<String> s1 = new ArrayList<>();
		s1.add("A");
		s1.add("B");
		s1.add("C");
		
		List<String> s2 = new ArrayList<>();
		s2.add("D");
		s2.add("E");
		s2.add("F");
		
		List<String> s3 = new ArrayList<>();
		s3.add("G");
		s3.add("H");
		s3.add("I");
		
		listx.add(s1);
		listx.add(s2);
		listx.add(s3);
		
		List<String> listy = listx.stream().flatMap( s -> s.stream().map(String::toLowerCase)).collect(Collectors.toList());
		System.out.println(listy);
		
		List<String> listz = Arrays.asList("5.6", "7.4");
		List<List<String>> listh =listz.stream().map(p -> Stream.of(p).collect(Collectors.toList())).collect(Collectors.toList());
		
		
	}

}

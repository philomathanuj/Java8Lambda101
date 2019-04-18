package com.java.lambda;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WrappersToFromPrimitiveArray {
	public static void main(String[] args) {
		int[] primitiveInts = {1, 2, 3};
		Integer[] wrappedInts = Arrays.stream(primitiveInts)
		                              .boxed()
		                              .toArray(Integer[]::new);
		int[] unwrappedInts = Arrays.stream(wrappedInts)
		                             .mapToInt(Integer::intValue)
		                             .toArray();
		//assertArrayEquals(primitiveInts, unwrappedInts);

		double[] primitiveDoubles = {1.1d, 2.2d, 3.3d};
		Double[] wrappedDoubles = Arrays.stream(primitiveDoubles)
		                                .boxed()
		                                .toArray(Double[]::new);
		double[] unwrappedDoubles = Arrays.stream(wrappedDoubles)
		                                  .mapToDouble(Double::doubleValue)
		                                  .toArray();

		//assertArrayEquals(primitiveDoubles, unwrappedDoubles, 0.0001d);
		char[] charArray = {'a','b','c'};
		System.out.println("H"+"a");
		System.out.println('H'+'a');
		// streams use spliterator not iterator and can process sequentially and parallelly
		// there is no conept of character streams
		//https://stackoverflow.com/questions/22435833/why-is-string-chars-a-stream-of-ints-in-java-8/22436638
		Stream<Character> chars = IntStream.range(0, charArray.length)
			    .mapToObj(i -> charArray[i]);
	}

}

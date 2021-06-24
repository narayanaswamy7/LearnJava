package com.ns.learnjava.lambdas.exceptions;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample2 {

	public static void main(String[] args) {
		int[] someNumbers = { 1, 2, 3, 4 };
		int key = 0;

		process(someNumbers, key, (v, k) -> System.out.println(v / k));

	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : someNumbers) {
			consumer.accept(i, key);
		}
	}

}

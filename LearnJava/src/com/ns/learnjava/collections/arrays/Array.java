package com.ns.learnjava.collections.arrays;

public class Array {
	public static void main(String[] args) {
		int[] array = new int[10];
		array[0] = 12;

		System.out.println(array[0]);

		for (int a : array) {
			System.out.print(a + " ");
		}
	}
}
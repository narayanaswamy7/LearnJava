package com.ns.learnjava;

public class DataTypes {
	public static void main(String[] args) {
		
		byte b = 50;
		b = 50*2;
		
		System.out.println(b);
	}
	
	public static double factorial(int n) {
		if (n<=1) return 1;
		return n * factorial(n-1);
	}

}

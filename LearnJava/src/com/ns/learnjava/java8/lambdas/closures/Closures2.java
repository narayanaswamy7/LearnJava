package com.ns.learnjava.java8.lambdas.closures;

public class Closures2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		doProcess(a, (i) -> System.out.println(i + b));
	}
	
	public static void doProcess(int i, Process1 p) {
		p.process(i);
	}
	
}

interface Process1 {
	void process(int i);
}

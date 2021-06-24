package com.ns.learnjava.java8.lambdas;

public class lambda1 {

	public static void main(String[] args) {
		
		MyLambda myLambdaFunction = () -> System.out.println("Hello World");
		myLambdaFunction.foo();
		
		MyAdd addFunction = (a, b) -> a + b;
		System.out.println(addFunction.add(1, 6));
		
		StringLengthLambda findLength = (s) -> s.length();
		System.out.println(findLength.getLength("Hello"));
		
		printLambda(s -> s.length());
	}
	
	public static void printLambda(StringLengthLambda s) {
		System.out.println(s.getLength("HelloWorldHi"));
	}

}

interface MyLambda {
	void foo();
}

interface MyAdd {
	int add(int a, int b);
}

interface StringLengthLambda {
	int getLength(String s);
}
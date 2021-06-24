package com.ns.learnjava.java8.methodreferences;

public class MethodReferencesExample {

	public static void main(String[] args) {

		Thread t = new Thread(() -> printMessage());
		t.start();
		
		Thread t2 = new Thread(MethodReferencesExample::printMessage); // this is method reference // () -> method()
		t2.start();
		
	}
	
	public static void printMessage() {
		System.out.println("Hello");
	}
	
}

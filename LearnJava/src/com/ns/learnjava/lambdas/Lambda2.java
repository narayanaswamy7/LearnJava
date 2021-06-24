package com.ns.learnjava.lambdas;

public class Lambda2 {
	
	public static void main(String[] args) {
		
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Printing inside Runnable");
			}
		});
		
		myThread.run();
		
		// ----------------------------------------------
		Thread myLambdaThread = new Thread(() -> System.out.print("Printed inside Lambda Runnable"));
		myLambdaThread.run();
		
	}
	
}

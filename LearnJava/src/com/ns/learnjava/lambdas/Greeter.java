package com.ns.learnjava.lambdas;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		
		Greeting lambdaGreting = () -> System.out.println("Hello World");
		
		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("Helllo World!");
			}
		};
		
		greeter.greet(() -> System.out.println("Hello World"));
		greeter.greet(innerClassGreeting);
		
	}
	
}

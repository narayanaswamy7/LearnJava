package com.ns.learnjava.java8;

public class ThisReferenceExample2 {

	public void doProcess(int i, Process1 p) {
		p.process(i);
	}

	public void execute() {
		doProcess(20, (i) -> {
			System.out.println("Value of i is " + i);
			System.out.println(this);
		});
	}

	public static void main(String[] args) {
		ThisReferenceExample2 thisReferenceExample2 = new ThisReferenceExample2();
		thisReferenceExample2.doProcess(10, (i) -> {
			System.out.println("Value of i is " + i);
			// System.out.println(this); this will give error
		});
		
		thisReferenceExample2.execute();
	}
	
	public String toString() {
		return "This is the main ThisRefereneExample2 class instance";
	}

}

interface Process1 {
	void process(int i);
}

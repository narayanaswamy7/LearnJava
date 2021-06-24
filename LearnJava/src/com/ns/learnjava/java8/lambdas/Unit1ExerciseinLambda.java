package com.ns.learnjava.java8.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1ExerciseinLambda {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Caroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Mattew", "Murdock", 38));

		// step 1: sort the list by last name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// step 2: create a method that prints all elements in the list
		printConditionally(people, p -> true);

		// step 3: create a method that prints all people have last name beginning with
		// C
		// lastName starts with C
		System.out.println("LastName beginning with C");
		printConditionally(people, p -> p.getLastName().startsWith("C"));

		// firstName starts with C
		System.out.println("FirstName beginning with C");
		printConditionally(people, p -> p.getFirstName().startsWith("C"));

	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}
	}

}

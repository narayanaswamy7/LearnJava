package com.ns.learnjava.java8.foreach;

import java.util.Arrays;
import java.util.List;

import com.ns.learnjava.java8.lambdas.Person;

public class CollectionIteration {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Caroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Mattew", "Murdock", 38));
	
		System.out.println("Using Regular for loop");
		for(int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
		
		// external iterator (for each)
		System.out.println("\nUsing for each loop");
		for (Person p: people) {
			System.out.println(p);
		}
		
		System.out.println("\nUsing java8's forEach and Lambda");
		people.forEach((p) -> System.out.println(p));
		
		System.out.println("\nUsing Method Reference");
		people.forEach(System.out::println);
		
	}
	
}

package com.ns.learnjava.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.ns.learnjava.java8.lambdas.Person;

public class StreamsExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Caroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Mattew", "Murdock", 38)
				);

		people.stream()
		.filter(p -> p.getLastName().startsWith("C"))
		.forEach((p) -> System.out.println(p));

		System.out.println("\nUsing the java 8 forEach");
		people.stream().
		filter(p -> p.getFirstName().startsWith("C"))
		.forEach(System.out::print);

		System.out.println();
//		Stream<Person> stream = people.stream();
		long count = people
				.stream()
				.filter(p -> p.getLastName().startsWith("C"))
				.count();
		System.out.println(count);

		people.parallelStream()
		.filter(p -> p.getLastName().startsWith("C"))
		.forEach(System.out::println);

	}

}
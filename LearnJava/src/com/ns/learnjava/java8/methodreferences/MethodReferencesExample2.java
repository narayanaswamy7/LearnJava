package com.ns.learnjava.java8.methodreferences;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.ns.learnjava.java8.lambdas.Person;

public class MethodReferencesExample2 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Caroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Mattew", "Murdock", 38));

		performConditionally(people, p -> true, System.out::println); // if form p -> method(), then can use method reference
	}

	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}

}

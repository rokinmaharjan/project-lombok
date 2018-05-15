package com.lombok;

import com.lombok.entity.Person;

public class Main {

	public static void main(String[] args) {
		Person person = Person.builder().name("Rokin Maharjan").age(23).address("Nepal").build();

		System.out.println(person.toString());
	}
}

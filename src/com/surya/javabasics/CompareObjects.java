package com.surya.javabasics;

class Person {
	String name;

	Person(String name) {
		this.name = name;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		Person person = (Person) obj;
		return name.equals(person.name);
	}
}

public class CompareObjects {

	public static void main(String[] args) {
		Person person1 = new Person("John");
		Person person2 = new Person("John");

		System.out.println(person1.equals(person2));

	}

}

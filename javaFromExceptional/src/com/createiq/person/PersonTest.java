package com.createiq.person;

public class PersonTest {
	public static void main(String[] args) {
		Person per = new Person(13,"Naveen");
		Person per1 = new Person(14,"Naveen");
		Person per2 = new Person(15,"Nage");
		Person per3 = new Person(16,"Hari");
		Person per5=per1;
		System.out.println(per.hashCode());
		System.out.println(per1.hashCode());
		System.out.println(per2.hashCode());
		System.out.println(per3.hashCode());
		System.out.println(per.equals(per1));
		System.out.println(per==per1);
		
		System.gc();
		Runtime.getRuntime().gc();
		
	}

}

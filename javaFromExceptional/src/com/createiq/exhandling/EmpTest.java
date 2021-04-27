package com.createiq.exhandling;

import java.util.Scanner;

public class EmpTest {
	
	public static void main(String[] args) {

	 Scanner se= new Scanner(System.in);
	 System.out.println(" enter the number and name");
	 int a =se.nextInt();
	// System.out.println(" enter name");
	 String s= se.toString();
	 Employee emp = new Employee(a,s);
		if(emp.getName()==null) {
			throw new ExceptionNameNotFound();
		}
		System.out.println(emp);
		System.out.println(emp.toString());
	
	}
	
	
	
	
	

}

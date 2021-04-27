package com.createiq.exhandling;

public class Ex1 {
	public static boolean VoteApp(int age) {
		
		if(age<18) {
			throw  new invalidAgeException("age is less than 18");
		}
		return true;
		
	}
	public static void main(String[] args) {
		
		try {
			if(VoteApp (10)) {
				System.out.println("ok");
			}
			
		}
		catch(invalidAgeException e) {
			e.printStackTrace();
		}
	}
	

}

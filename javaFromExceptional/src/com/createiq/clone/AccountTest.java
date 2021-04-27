package com.createiq.clone;

public class AccountTest {
	
	public static void main(String[] args) {
		Account account1 = new Account ("Harish",5000.0,123);
		System.out.println(account1);
		Account account2= new Account("kiran",1500.0,124);
		System.out.println(account2);
	    System.out.println(account1.equals(account2));
		Account account = new Account("Balaji", 20000.00,125);
		System.out.println(account);
		
		System.out.println(" account obj " +account);
	try {
			Account cloneAccount = (Account) account.clone();
			System.out.println(" cloneAccount obj " +cloneAccount);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
		
	}



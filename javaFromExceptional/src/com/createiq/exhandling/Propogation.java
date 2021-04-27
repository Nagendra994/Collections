package com.createiq.exhandling;

public class Propogation {

void m() {
	int data =50/0;
	
}
	
void n() {
	 m();
}
void p() {
	try {
		n();
		
	}
	catch(Exception e) {
		System.out.println("exception handled");
	}
	
}
public static void main(String[] args) {
	Propogation prop = new Propogation();
	prop.p();
	System.out.println("The code continues");
	
}
	


}

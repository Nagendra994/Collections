package com.createiq.gc;


	public class Garbage3 {

	
	public Garbage3() {
		System.out.println("Object created ");
	}
	
	public void display() {
		System.out.println("I am display ... ");
	}
	
	
	
	@Override
	public void finalize() throws Throwable {
		System.out.println("finalize called Object removed...");
	}
	
	public static void main(String[] args) {
		Garbage3 e1 = new Garbage3();
		Garbage3 e2 = new Garbage3();
		Garbage3 e3 = new Garbage3();
		e1=null;
		e2=e3;
		new Garbage3().display();
		Runtime.getRuntime().gc();
	}

}

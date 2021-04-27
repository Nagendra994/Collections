package com.createiq.thread;
//multithreading by Extending the thread class
public class ThreadClass {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		t1.start();
		t2.start();
		t3.start();
		
	}

}

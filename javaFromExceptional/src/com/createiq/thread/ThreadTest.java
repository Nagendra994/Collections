package com.createiq.thread;

public class ThreadTest {
	public static void main(String[] args) {
		
	Methods t1 = new Methods("Nagendra Thread");
	Methods t2 = new Methods();
	Methods t3 = new Methods();
	t2.setName("pspk");
	System.out.println(t2.getName());
	t3.setName("Kiran");
	t1.setPriority(8);
	t1.start();
	try {
		t1.join(1000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	t2.start();
	t3.start();
	
	}	

}

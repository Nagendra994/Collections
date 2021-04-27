package com.createiq.thread;

public class Thread1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("my name is:");
		}
		
	}
	

}

package com.createiq.gc;

public class Garbage {
	
	public void m1() {
		System.out.println("garbage collector");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize");
	}

	public static void main(String[] args) {
		Garbage g = new Garbage();
		Garbage g1 = new Garbage();
		Garbage g3 = new Garbage();
		g.m1();
		g=null;
		g1=g;
		g=g3;
		g3=g1;
		System.gc();
		
		
		
	}

}

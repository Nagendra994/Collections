package com.createiq.clone;

public class Clone1Test implements Cloneable{
	
	int a;
	int b;
	Clone1 c = new Clone1();
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	

}

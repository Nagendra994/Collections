package com.createiq.object;

public class ObjectCreation {
	
	String str ="hello";
	public static void main(String[] args) {
		try {
		ObjectCreation obj =ObjectCreation.class.newInstance();
		System.out.println(obj.str);

		}
		catch(Exception e) {
			
	     e.printStackTrace();
		}
		
		
		
	}

}

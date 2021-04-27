package com.createiq.clone;

public class CloneTest {
	
	
		public static void main(String[] args) {
			Clone obj = new Clone();
			System.out.println(obj.x+"   "+obj.y);
		    Clone obj1= obj;
		    obj1.x=200;
		    obj1.y=14;
		    System.out.println(obj.x+"   "+obj.y);
		    System.out.println(obj1.x+"    "+obj1.y);
		    
		
		
	}
	}



package com.createiq.gc;

public class Garbage1 {
	
	public static class Garbage{

		public void m1(){
		System.out.println("The Garbage collection");
		}
		
		
		
		@Override
		 public void finalize() throws Throwable {
			System.out.println("Garbage collection");
		}



		public static void main(String args[]){
		Garbage G1 = new Garbage();
		Garbage G2= new Garbage();
		Garbage G3 = new Garbage();
		G1.m1();
		
		
		System.gc();
		}

	
		}

	


}

package PracticeRandom;

public class Threading extends Thread {
	public void run() {	
		System.out.println("the code is running in the  thread");
		
	}
	public static void main(String[] args) {
		Threading thread = new Threading();
		thread.start();
		System.out.println("D");
	}
	
	
	

}

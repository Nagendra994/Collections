package com.createiq.thread;
// multi-threading by implementing runnable interface
public class Youtube {
	public void Stream() {
		 for (int i = 0; i < 10; i++) {
			 System.out.println("stream");
			 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

	   public void play() {
		   for (int i = 0; i < 10; i++) {
			   System.out.println("playing after streaming");
			   
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			}
		   
	   }
}










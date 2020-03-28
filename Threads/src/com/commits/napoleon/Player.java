package com.commits.napoleon;

// can also implement Runnable interface...
public class Player extends Thread{
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i+=1) {
			System.out.println(Thread.currentThread().getName() + " is working...");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				break;
			}
		}
	}
}

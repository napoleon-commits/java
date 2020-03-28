package com.commits.napoleon;

import java.util.Date;

public class Aesop implements Runnable{
	private Object Tortoise;
	private Object Hare;
	
	public Aesop() {
		
	}
	
	public Aesop(Object Tortoise, Object Hare) {
		this.Tortoise = Tortoise;
		this.Hare = Hare;
	}
	
	private String currentTime() {
		return new Date(System.currentTimeMillis()).toString().substring(11,19);
	}
	
	private void move(String action) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " " + action);
		Thread.sleep((int) (Math.random() * 100));
	}
	
//	needed to perform action on a thread
	@Override
	public void run() {
		try {
		while(true) {
				move(currentTime() + ": spectators watching the race...");
				
				synchronized(Tortoise) { // only allow one thread at a time into a particular section of code
					move(currentTime() + ": tortoise is moving");
					
					synchronized(Hare) {
						move(currentTime() + ": hare is moving");
						move(currentTime() + ": hare has stopped moving");
					}
					
					move(currentTime() + ": hare has stopped moving - spectators hold their breath.");
					return;
				}
			} 
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			Thread.currentThread().interrupt();
			return;
		}
	}
}

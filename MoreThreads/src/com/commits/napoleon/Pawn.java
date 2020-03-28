package com.commits.napoleon;

import java.util.Random;

public class Pawn implements Runnable{
	
	String name;
	int time;
	
	Random r = new Random();
	
	public Pawn(String name) {
		this.name = name;
		this.time = r.nextInt(999);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.printf("%s is sleeping for %d milliseconds\n", name, time);
		try {
			Thread.sleep(time); // no need to specify which thread
			System.out.printf("%s is done\n", name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
}

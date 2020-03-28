package com.commits.napoleon;

import java.util.concurrent.Semaphore;

public class Driver {
	public static void main(String[] args) {
		Semaphore sem = new Semaphore(13);
		
		System.out.println("Available permits: " + sem.availablePermits());
		
		try {
			sem.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Available permits: " + sem.availablePermits());
		
		// Releases a permit back to the semaphore
		sem.release();
		System.out.println("Available permits: " + sem.availablePermits());
		
		System.out.println("Fairness: " + sem.isFair());
	}
}

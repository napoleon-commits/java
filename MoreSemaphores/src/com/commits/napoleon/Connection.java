package com.commits.napoleon;

import java.util.concurrent.Semaphore;

// Singleton design pattern
public class Connection {
	private static Connection instance = new Connection();
	private int numberOfConnections = 0;
	private Semaphore sem = new Semaphore(10, true); // 10 connections at a time
	
	private Connection() {
		
	}
	public static Connection getInstance() {
		return instance;
	}
	
	public void connectWrapper() {
		
		try {
			sem.acquire();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			connect();
		} finally {
			sem.release();
		}
		
	}
	
	public void connect() {
		synchronized (this){
			numberOfConnections += 1;
			System.out.println("Number of connections: " + numberOfConnections);
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		synchronized(this) {
			numberOfConnections -= 1;
		}
		
	}
}

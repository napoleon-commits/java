package com.commits.napoleon;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Semaphore sem = new Semaphore(0); // an object that maintains a count of available permits
//		sem.release();
//		try {
//			sem.acquire(); // will wait if there are no permits available
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println(sem.availablePermits());
		
		
		
		ExecutorService es = Executors.newCachedThreadPool();
		
		
//		creating 200 threads and running the connect method
		
		for(int i = 0; i < 200; i+=1) {
			es.submit(new Runnable() {
				public void run() {
					Connection.getInstance().connectWrapper();
				}
			});
		}
		
		es.shutdown();
		
		try {
			es.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

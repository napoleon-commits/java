package com.commits.napoleon;

import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		/*
		 * When to use a string
		 * 
		 * When you want an immutable string
		 */
		
		/*
		 * When to use a StringBuffer
		 * 
		 * When you want a mutable string
		 * Thread-safe
		 */
		
		/*
		 * When to use a StringBuilder
		 * 
		 * When you want a mutable string
		 * Not thread-safe
		 */
		
		StringBuffer sbuff = new StringBuffer();
		StringBuilder sbuil = new StringBuilder();
		
		Runnable r = () -> {
			Random rnd = new Random();
			for(int i = 0; i<1000; i+=1) {
				char c = (char) (rnd.nextInt(26) + 'a');
				sbuff.append(c); // thread safe
				sbuil.append(c); // not thread safe
			}
		};
		
		Thread t[] = new Thread[0x10];
		for(int i = 0; i < t.length; i+=1) {
			t[i] = new Thread(r);
			t[i].start();
		}
		
		/**
		 * wait until all threads stop
		 */
		
		for(int i = 0; i < t.length; i+=1) {
			try {
				t[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(sbuff.length());
		System.out.println(sbuil.length());
	}

}

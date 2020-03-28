package com.commits.napoleon;

public class Driver {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
//		System.out.println(Aesop.currentTime());
		
//		try {
//			Aesop.move("action, a");
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Aesop[] aes = new Aesop[5];
		Object[] contestants = new Object[aes.length];
		
		for(int i = 0; i < contestants.length; i+=1) {
			contestants[i] = new Object();
		}
		
		for(int i = 0; i < contestants.length; i+=1) {
			Object tortoise = contestants[i];
			Object hare = contestants[(i + 1) % contestants.length];
			
//			
//			fix deadlock problem by swapping tortoise and hare
//			
			if(i == aes.length - 1) {
				aes[i] = new Aesop(hare, tortoise);
			} else {
				aes[i] = new Aesop(tortoise, hare);
			}
			
//			aes[i] = new Aesop(tortoise, hare);
			
			Thread t = new Thread(aes[i], "Aesop " + (i + 1));
			t.start();
		}
	}
}

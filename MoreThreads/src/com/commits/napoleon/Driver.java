package com.commits.napoleon;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new Pawn("a1"));
		Thread t2 = new Thread(new Pawn("a2"));
		Thread t3 = new Thread(new Pawn("a3"));
		Thread t4 = new Thread(new Pawn("a4"));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}

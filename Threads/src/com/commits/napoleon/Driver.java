package com.commits.napoleon;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player();
		p1.start();
		
		Player p2 = new Player();
		p2.setPriority(9);
		p2.start();
		
		System.out.println(p1.getPriority());
		System.out.println(p2.getPriority());
		
		System.out.println("p1's thread is alive: " + p1.isAlive());
		System.out.println("p2's thread is alive: " + p2.isAlive());
	}

}

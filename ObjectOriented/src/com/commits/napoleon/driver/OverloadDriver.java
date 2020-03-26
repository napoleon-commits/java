package com.commits.napoleon.driver;

public class OverloadDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short s = 6;
		long l = 7;
		
		go(s); // prints int argument because, int is bigger than a short
		go((Short)s); // prints short argument because of explicit casting
		go(l); // print long argument
	}
	
	public static void go(int a0) {
		System.out.println("Int argument.");
	}
	
	public static void go(Short a0) {
		System.out.println("Short argument.");
	}
	
	public static void go(Long a0) {
		System.out.println("Long argument.");
	}

}

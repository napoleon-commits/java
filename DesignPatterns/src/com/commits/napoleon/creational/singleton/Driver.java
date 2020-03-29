package com.commits.napoleon.creational.singleton;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		s1.setValue(10);
		
		System.out.println(s1.getValue());
		System.out.println(s2.getValue());
		
		System.out.println("es1 == es2?: " + (s1 == s2));
	}

}

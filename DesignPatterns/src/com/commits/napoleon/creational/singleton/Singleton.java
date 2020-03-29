package com.commits.napoleon.creational.singleton;

public class Singleton {
	private int value;
	public static Singleton mySingleton = new Singleton();
	private Singleton() {}
	public static Singleton getInstance() {
		return mySingleton;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}

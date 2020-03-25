package com.commits.napoleon;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("unused")
		Driver obj = new Driver();
		
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		obj = null;
		
		System.gc();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("End");

	}
	
	// Method called when System.gc is called 
	protected void finalize() {
		System.out.println("Driver's finalize() method called!");
		System.out.println("Goodbye");
	}

}

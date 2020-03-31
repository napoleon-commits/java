package com.napoleon.commits;

import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

public class Driver {
	public static void main(String[] args) {
		System.out.println("ArrayList vs Vectors");

		VectorStudy vs = new VectorStudy();
		
		System.out.println("Showing the vector capacity after adding 25 elements....");
		
		for(int i = 0; i < 25; i+=1) {
			vs.addInt(i);
			System.out.print(vs.getCapacity() + ", ");
		}
		System.out.println();
//		
//		
//		
		System.out.println("-----------------------");
		System.out.println("Showing the arraylist capacity after adding 25 elements....");
		ArrayListStudy als = new ArrayListStudy();
		
		for(int i = 0; i < 25; i+=1) {
			als.addInt(i);
			try {
				System.out.print(als.getCapacity() + ", ");
			} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println();
		
		/*
		 * Testing thread safety....
		 */
		
		Vector<Integer> v = new Vector<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		Runnable rnnbl = () -> {
			Random rndm = new Random();
			for(int i = 0; i < 100; i+=1) {
				v.add(rndm.nextInt());
				al.add(rndm.nextInt());
			}
		};
		
		Thread[] t = new Thread[0x10];
		for(int i =0 ; i < t.length; i+=1) {
			t[i] = new Thread(rnnbl);
			t[i].start();
		}
		
		for(int i =0 ; i < t.length; i+=1) {
			try {
				t[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(v.size());
		System.out.println(al.size());
		
	}
}

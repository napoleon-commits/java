package com.commits.napoleon;

import java.util.PriorityQueue;
import java.util.Random;

public class QueueDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> q1= new PriorityQueue<Integer>();
		Random rndm = new Random();
		
		for(int i = 10; i > 0; i--) {
			q1.add(rndm.nextInt(25));
		}
		
		System.out.println(q1);
//		System.out.println(q1.peek());
//		poll removes the head
		
		while(q1.size() > 0) {
			System.out.println(q1.poll());
		}
	}

}

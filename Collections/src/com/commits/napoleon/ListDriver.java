package com.commits.napoleon;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDriver {
	public static void main(String[] args) {
//		only string
		ArrayList<String> list1 = new ArrayList<String>();
		
		ArrayList<Object> list2 = new ArrayList<Object>();
		
		list1.add("daniel");
		list1.add("ben");
		list1.add("tyler");
		list1.add("grace");
//		list1.add(1); error
		
		list2.add("john");
		list2.add(10);
		list2.add(2.2);
		list2.add('A');

//		get element
		
		System.out.println(list1.get(2));
		
//		set element
		list1.set(2, "Liz");
		
//		remove element
		list1.remove(2);
		
//		clear all
//		list1.clear();
		
//		iterate with for loop
		System.out.println(list1.size());
		
//		can also use enhance for loop
		
		
//		can also use iterator
		Iterator<String> itr = list1.iterator();
		
		System.out.println(itr.next());
		System.out.println(itr.next());
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}

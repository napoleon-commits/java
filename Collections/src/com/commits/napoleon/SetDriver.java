package com.commits.napoleon;

//import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashSet<String> set = new HashSet<String>(); // fast
		TreeSet<String> set = new TreeSet<String>(); // sorts the set
		
		set.add("John");
		set.add("Jane");
		set.add("Jack");
		set.add("Jimmy");
		set.add("James");
		set.add("Joe");
		set.add("Jack");
		
//		output is hashed. data is unique
		System.out.println(set);
		
		Iterator<String> itr = set.iterator();
		
//		no indexes
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(set.contains("Jack"));
		System.out.println(set.size());
		
		
		

	}

}

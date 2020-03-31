package com.napoleon.commits;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListStudy {
	private ArrayList<Integer> al;
	
	public ArrayListStudy() {
		al = new ArrayList<Integer>();
	}
	
	public void addInt(int e) {
		al.add(e);
	}
	
	/*
	 * To check the capacity of an arraylist, one must use reflection
	 * the private variable elementData contains the capacity
	 * 
	 * @return int
	 */
	public int getCapacity() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		Field f = ArrayList.class.getDeclaredField("elementData");
		
		f.setAccessible(true);

		Object[] arr = (Object[]) f.get(al);

		return arr.length;
		
	}
}

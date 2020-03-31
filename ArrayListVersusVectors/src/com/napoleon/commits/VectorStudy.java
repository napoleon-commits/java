package com.napoleon.commits;

import java.util.Vector;

public class VectorStudy {
	
	private Vector<Integer> v;
	
	public VectorStudy() {
		v = new Vector<Integer>();
	}
	
	public void addInt(int e) {
		v.add(e);
	}
	
	public int getCapacity() {
		return v.capacity();
	}
}

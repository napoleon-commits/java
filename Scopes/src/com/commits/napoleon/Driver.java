package com.commits.napoleon;

public class Driver {
	
	public static int x = 0;
	
	private static int myOuterInt = 9;
	
	public static int changeX(int x) {
		return ++x;
	}
	
	// the keyword static is needed!
	public int getMyInnerInt(int myInnerInt) {
		return myInnerInt;
	}
	
	class FooClass {
		public int getMyOuterInt() {
			return myOuterInt;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(x);
		System.out.println(changeX(x));
		System.out.println(changeX(x));
		System.out.println(changeX(x));
		System.out.println(x);
		x = changeX(x);
		x = changeX(x);
		x = changeX(x);
		System.out.println(x);
		
		// Cannot make a static reference to the non-static method getMyInnerInt(int) from the type Driver
		// System.out.println(getMyInnerInt(5));
		
		Driver d = new Driver();
		FooClass fc = d.new FooClass();
		
		System.out.println(fc.getMyOuterInt());
	}

}

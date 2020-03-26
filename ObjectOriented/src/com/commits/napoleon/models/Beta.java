package com.commits.napoleon.models;

import java.io.IOException;

public class Beta {
	public int myPublicInt = 1;
	protected double myProtectedDouble = 5.0;
	private char myPrivateChar = 'a';
	String myPackageString = "hello";
	private Shape myPrivateShape = new Shape(3,2);
	private Circle myPrivateCircle = new Circle(2);
	
	public static int myPublicStaticInt = 2;
	protected static double myProtectedStaticDouble = 10.0;
	private static char myPrivateStaticChar = 'b';
	static String myPackageStaticString = "dobroe ootrom";
	
	public final int MY_PUBLIC_FINAL_INT = 100;
	protected final double MY_PROTECTED_FINAL_DOUBLE = 2.168;
	private final char MY_PRIVATE_FINAL_CHAR = 'z';
	final String MY_PACKAGE_FINAL_STRING = "que tal";
	
	
	public int getMyPublicInt() {
		return myPublicInt;
	}
	public double getMyProtectedDouble() {
		return myProtectedDouble;
	}
	public char getMyPrivateChar() {
		return myPrivateChar;
	}
	public String getMyPackageString() {
		return myPackageString;
	}
	public Shape getMyPrivateShape() {
		return myPrivateShape;
	}
	public Circle getMyPrivateCircle() {
		return myPrivateCircle;
	}
	public static int getMyPublicStaticInt() {
		return myPublicStaticInt;
	}
	public static double getMyProtectedStaticDouble() {
		return myProtectedStaticDouble;
	}
	public static char getMyPrivateStaticChar() {
		return myPrivateStaticChar;
	}
	public static String getMyPackageStaticString() {
		return myPackageStaticString;
	}
	public int getMY_PUBLIC_FINAL_INT() {
		return MY_PUBLIC_FINAL_INT;
	}
	public double getMY_PROTECTED_FINAL_DOUBLE() {
		return MY_PROTECTED_FINAL_DOUBLE;
	}
	public char getMY_PRIVATE_FINAL_CHAR() {
		return MY_PRIVATE_FINAL_CHAR;
	}
	public String getMY_PACKAGE_FINAL_STRING() {
		return MY_PACKAGE_FINAL_STRING;
	}
	
//	
//	
//	
	
	public String publicStringThrowsIOException() throws IOException {
		return "How can we override this method by changing the exception thrown?";
	}
	
	protected String protectedStringThrowsException() throws Exception{
		return "Override this by throwing a more specific exception.";
	}
}

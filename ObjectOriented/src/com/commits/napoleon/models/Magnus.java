package com.commits.napoleon.models;

import java.io.FileNotFoundException;

public class Magnus extends Beta{
	public int myPublicInt = 9;
	
	public int shadowGetter() {
		return super.myPublicInt;
	}
	
	@Override
	public double getMyProtectedDouble() {
		return super.myProtectedDouble;
	}
	
	@Override
	protected String protectedStringThrowsException() throws FileNotFoundException {
		return "Method overriden.";
	}
}

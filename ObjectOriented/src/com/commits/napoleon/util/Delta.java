package com.commits.napoleon.util;

import com.commits.napoleon.models.Beta;
import com.commits.napoleon.models.Circle;

public class Delta extends Beta{
	
	@Override
	public double getMyProtectedDouble() {
		return super.myProtectedDouble;
	}
	
	@Override
	public String protectedStringThrowsException() throws RuntimeException {
		return "Successfully overridden#!@#";
	}
	
//	Can change the return type only if the return type is part of the subclass
	public Circle getMyPrivateShape() {
		return new Circle();
	}
}

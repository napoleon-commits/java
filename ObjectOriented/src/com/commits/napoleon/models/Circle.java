package com.commits.napoleon.models;

import static java.lang.Math.PI;

public class Circle extends Shape{
	private double radius;
	private double circumference;
	
	public Circle() {
		super("Infinity", 2);
		this.radius = 1.0;
		
		this.circumference = 2 * PI * radius;
	}
	
	public Circle(double radius) {
		super("Infinity", 2);
		this.radius = radius;
		this.circumference = 2 * PI * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getCircumference() {
		return circumference;
	}

	public void setCircumference(double circumference) {
		this.circumference = circumference;
	}
}

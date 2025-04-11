package com.javaex.problem04;

public abstract class Shape {
	private double width;
	private double height;
	
	public abstract void Shape(double width, double height);
	
	public abstract void getCountSides();
	
	
	abstract double getArea();
	abstract double getPerimeter();

}

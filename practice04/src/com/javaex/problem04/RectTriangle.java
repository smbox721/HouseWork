package com.javaex.problem04;

public class RectTriangle extends Shape{
	private double width;
	private double height;
	
	//생성자
	public RectTriangle (double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	//게터 세터
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	//매서드
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (double) width * height * 0.5;
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		double side = width + width + Math.sqrt(width*width + height*height);
		return (double)side;
	}
}
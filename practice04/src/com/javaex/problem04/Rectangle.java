package com.javaex.problem04;

public class Rectangle extends Shape  implements Resizeable{
	private double width;
	private double height;
	
	//생성자
	public Rectangle(double width, double height) {
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
	public void resize(double d) {
		// TODO Auto-generated method stub
		width = width * d;
        height = height * d;
		
	}
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return (double) width * height;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return (double)(width + height) * 2;
	}
}

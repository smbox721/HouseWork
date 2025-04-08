package com.javaex.problem02;

public class Depart extends Employee {
	private String depart;
	
	public String getDepart() {
		return depart;
	}
	
	public Depart(String name, int salary, String depart) {
		// TODO Auto-generated constructor stub
		super(name, salary);
		this.depart = depart;
	}
	
	@Override
	public void getInformation() {
		System.out.println("이름: " + this.getName() + " 연봉: " + this.getSalary() + " 부서: " + getDepart());
	}

}

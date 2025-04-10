package com.javaex.problem01;

public class Friend {
	private String name;
	private String phone;
	private String school;
	
//	public Friend (String name) {
//		this.name = name;
//	}
	
	public Friend (String name, String phone, String school) {
		this.name = name;
		this.phone = phone;
		this.school = school;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "이름: " + name + ", 핸드폰: " + phone + ", 학교: " + school ;
	}
	
	
}

package com.javaex.problem03;

public class Goods {

    private String name;
    private int price;
    private int count;
    
    
	public Goods(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
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
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}


	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}


	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}


	@Override
	public String toString() {
		return name + " (가격:" + price +"원) 이 " + count + " 개 입고되었습니다.";
	}
    
    
    
}

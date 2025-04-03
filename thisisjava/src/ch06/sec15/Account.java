package ch06.sec15;

public class Account{
	//필드
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	private int balance;
  	private String an;
  	private String owner;
  
  	//계좌 개설
  	public Account(String an, String owner, int balance) {
  	this.an = an;
  	this.owner = owner;
  	this.balance = balance;
  	}
  	
  	//an get
  	public String getAn() { 
  		return an; 
	}
  	//an set
  	public void setAn(String an) { 
  		this.an = an;
  	}
  	//balance get
  	public String getOwner() { 
  		return owner; 
	}
  	//balance set
  	public void setOwner(String owner) {
  		this.owner = owner; 
	}
	
	//balance get
  	public int getBalance() {
	    return balance;
  	}
  	//balance set
  	public void setBalance(int balance) {
  		if (balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE) {
	      return;
	    }
	    this.balance = balance;
  	}
 

}

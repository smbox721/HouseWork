package ch06.sec15;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accounts = new Account[100];
	private static Scanner scanner = new Scanner(System.in);	

	public static void main(String[] args) {	
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			String menu = scanner.nextLine();
			
			if(menu.equals("1")) {
				//계좌생성
				createAccount();
			}else if(menu.equals("2")) {
				//계좌목록
				showAccount();
			}else if(menu.equals("3")) {
				//예금
				deposit();
			}else if(menu.equals("4")) {
				//출금
				withdraw();
			}else if(menu.equals("5")){
				//종료
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	//계좌 생성 
	private static void createAccount() {
		System.out.println("------------");
		System.out.println("계좌생성");
		System.out.println("------------");
		
		System.out.print("계좌번호: ");
		String an = scanner.nextLine();
		
		System.out.print("계좌주: ");
		String owner = scanner.nextLine();
		
		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(scanner.nextLine());
		Account newAccount = new Account(an, owner, balance);
		
		for(int i=0; i < accounts.length; i++) {
			if(accounts[i] == null) {
				accounts[i] = newAccount;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	//계좌 목록
	private static void showAccount () {
		System.out.println("----------");
		System.out.println("계좌목록");
		System.out.println("----------");
	
		for(int i=0; i<accounts.length; i++) {
			Account account = accounts[i];
			if(account != null) {
				System.out.print(account.getAn());
				System.out.print(" ");
				System.out.print(account.getOwner());
				System.out.print(" ");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}
	}
	//예금
	public static void deposit() {
		System.out.println("----------");
		System.out.println("예금");
		System.out.println("----------");

		System.out.print("계좌번호: ");
		String an = scanner.nextLine();
		System.out.print("예금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		Account account = findAccount(an);
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("결과: 예금이 성공되었습니다.");
	}
	
	//출금		
	public static void withdraw() {
		System.out.println("----------");
		System.out.println("출금");
		System.out.println("----------");
		
		System.out.print("계좌번호: ");
		String an = scanner.nextLine();
		System.out.print("출금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		Account account = findAccount(an);
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("결과: 출금이 성공되었습니다.");
	}

	//계좌일치여부
	private static Account findAccount(String an) {
		Account account = null;
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] != null) {
				String newAn = accounts[i].getAn();
				if(newAn.equals(an)) {
					account = accounts[i];
					break;
				}
			}
		}
		return account;
	}
}

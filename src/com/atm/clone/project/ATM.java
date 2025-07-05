package com.atm.clone.project;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\t\t\t WELCOME TO ATM");
		System.out.println("\t\t\t* * * * * * * * * ");
		System.out.println("\t\t\t Select Options");
		System.out.print(" 1.Check Balance");
		System.out.println("\t\t\t\t 2.Deposit");
		System.out.println();
		System.out.print(" 3.Withdraw");
		System.out.println("\t\t\t\t\t 4.Change pin");
		System.out.println("\t\t\t 5.Exit");
		int choice = scanner.nextInt();

		switch(choice) {
		case 1:
			if(checkPIN()) {
				AccountBalance.checkBalance();
			}
			else {
				System.err.println("your card is block for 24 hours");
			}
			break;
			
		case 2:
			if(checkPIN()) {
				Deposit.addMoneyToAccount();
			}
			else {
				System.err.println("your card is block for 24 hours");
			}
			break;
			
		case 3:
			if(checkPIN()) {
				Withdraw.withdrawMoney();
			}
			else {
				System.err.println("your card is block for 24 hours");
			}
			break;
			
		case 4:
			if(checkPIN()) {
				ChangePin.changePin();
			}
			else {
				System.err.println("your card is block for 24 hours");
			}
			break;
			
		case 5:
			ExitSystem.exitSystem();
			break;
		}
	}
	
	static int checkAttemp = 1;
	static int password = 1234;
	public static boolean checkPIN() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your pin: ");
		int userEnteredPassword = scanner.nextInt();
		if(userEnteredPassword == password) {
			return true;
		}else {
			System.err.println("Wrong password "+(3-checkAttemp)+" attempt left");
				checkAttemp++;
			if(checkAttemp <= 3) {
				return checkPIN();
			}
		}		
		return false;
	}

}

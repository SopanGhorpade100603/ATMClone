package com.atm.clone.project;

import java.util.Scanner;

public class Deposit {

	public static void addMoneyToAccount(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter amount to Deposit: ");
		double depositAmount = scanner.nextDouble();
		
	
		if(depositAmount >=0) {
		AccountBalance.balance +=depositAmount ;
		System.out.println("your balance : "+AccountBalance.balance+"\n");
		System.out.println("1.go to main Menu");
		System.out.println("2.Exit");
		int choice = scanner.nextInt();
			if(choice == 1) {
				ATM.main(null);
			}
			else if(choice == 2) {
			ExitSystem.exitSystem();
			}
		}
		else {
			System.err.println("invalid amount");
			ATM.main(null);
		}
	}
}

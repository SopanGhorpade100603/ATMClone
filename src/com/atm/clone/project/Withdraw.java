package com.atm.clone.project;

import java.util.Scanner;

public class Withdraw {
	public static void withdrawMoney() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter amount to withdraw :");
		double withdrawAmount = scanner.nextDouble();
		if(withdrawAmount <= AccountBalance.balance) {
			AccountBalance.balance -= withdrawAmount;
			System.out.println("your remaining amount : "+AccountBalance.balance+'\n');			
				ExitSystem.exitSystem();
		}
		else {
				System.err.println("insufficient fund!!!");
				System.out.println("main balance : "+AccountBalance.balance);
		}
		
	}

}

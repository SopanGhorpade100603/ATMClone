package com.atm.clone.project;

import java.util.Scanner;

public class AccountBalance {
	static double balance = 10000;
	public static void checkBalance() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("your balance : "+balance);
		System.out.println();
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

}

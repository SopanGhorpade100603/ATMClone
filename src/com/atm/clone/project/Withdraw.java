package com.atm.clone.project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Withdraw {
	public static void withdrawMoney() {
		Scanner scanner = new Scanner(System.in);
		try (scanner) {
			System.out.print("Enter amount to withdraw :");
			double withdrawAmount = scanner.nextDouble();
			if (withdrawAmount <= AccountBalance.balance) {
				AccountBalance.balance -= withdrawAmount;
				System.out.println("your remaining amount : " + AccountBalance.balance + '\n');
				ExitSystem.exitSystem();
			} else {
				System.err.println("insufficient fund!!!");
				System.out.println("main balance : " + AccountBalance.balance);
			}
		} catch (InputMismatchException e) {
			System.err.println("Invalid input! Please enter a number...");
			ExitSystem.exitSystem();
		}

	}

}

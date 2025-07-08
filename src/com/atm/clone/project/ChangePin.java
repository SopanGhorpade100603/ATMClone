package com.atm.clone.project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChangePin {

	public static void changePin() {
		Scanner scanner = new Scanner(System.in);
		try (scanner) {
			System.out.println("Enter old pin: ");
			int oldPin = 0;
			try {
				oldPin = scanner.nextInt();
				if (oldPin == ATM.password) {
					System.out.print("Enter new Pin: ");
					int newPin = scanner.nextInt();
					ATM.password = newPin;
					System.out.println("new pin succefully updated");
					ATM.main(null);
				} else {
					System.err.println("invalid old pin");
					ExitSystem.exitSystem();
				}
			} catch (InputMismatchException e) {
				System.err.println("Invalid input! Please enter a number...");
				ExitSystem.exitSystem();
			}
		}
	}
}

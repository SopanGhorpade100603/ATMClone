package com.atm.clone.project;

import java.util.Scanner;

public class ChangePin {

	public static void changePin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter old pin: ");
		int oldPin = scanner.nextInt();
		if(oldPin == ATM.password) {
			System.out.print("Enter new Pin: ");
			int newPin = scanner.nextInt();
			ATM.password = newPin;
			System.out.println("new pin succefully updated");
			ATM.main(null);
		}
		else {
		System.err.println("invalid old pin");	
		ATM.main(null);
		}
	}
}

package com.atm.clone.project;

public class ExitSystem {
	public static void exitSystem() {
		try {
			System.err.print(".");
			Thread t = new Thread(() -> {
				for (int i = 1; i <= 3; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.err.print(".");
				}
			});
			t.start();
			t.join();
			System.err.println("Exit");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

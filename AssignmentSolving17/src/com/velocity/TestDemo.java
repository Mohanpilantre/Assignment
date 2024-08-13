package com.velocity;

import java.io.FileInputStream;
import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		// this is java class 25 pune 30 software 45
		int vowelCounter = 0;
		int numberCounter = 0;
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Jeevan\\Desktop\\abc.txt");
			Scanner scanner = new Scanner(fis);
			while (scanner.hasNextLine()) { // true

				String s = scanner.nextLine(); //

				for (int i = 0; i < s.length(); i++) {

					char ch = s.charAt(i); // t

					if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'
							|| ch == 'I' || ch == 'O' || ch == 'U') {
						vowelCounter++;
					}
					// ch=='1'||ch=='2'
					if (ch >= 48 && ch <= 57) {
						numberCounter++;
					}
				}
			}
			System.out.println("Total vowels are>>" + vowelCounter);
			System.out.println("Total number are>>" + numberCounter);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

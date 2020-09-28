package com.capgemini.regexemailvalidation;

import java.util.Scanner;

public class TakingInput {
	private static String email;

	static String read() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Email Address");
		email = scan.nextLine();
		return email;
	}
}

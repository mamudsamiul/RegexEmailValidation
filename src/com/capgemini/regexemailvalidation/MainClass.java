package com.capgemini.regexemailvalidation;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Welcome to email validation");
		String emailAddress = TakingInput.read();
		if (CheckFormat.check(emailAddress))
			System.out.println("Valid EmailAddress");
		else
			System.out.println("Invalid Email Address");
	}
}

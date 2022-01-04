package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name:");
		String firstName = sc.nextLine();

		RegexRegistration regex = new RegexRegistration();
		if (regex.isFirstName(firstName) == true) {
			System.out.println("Firstname is Correct");
		} else {
			System.out.println("Firstname is Incorrect " + "\n"
					+ "Enter First name starts with Capital letter and has minimum 3 characters");
		}
	}

}

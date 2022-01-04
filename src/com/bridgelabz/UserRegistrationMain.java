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
		
		System.out.println("Enter the last name:");
		String lastName = sc.nextLine();
		if (regex.isLastName(lastName) == true) {
			System.out.println("Lastname is Correct");
		} else {
			System.out.println("Lastname is Incorrect " + "\n"
					+ "Enter Last name starts with Capital letter and has minimum 3 characters");
		}
		
		System.out.println("Enter the Email id:");
		String email = sc.nextLine();
		if (regex.isValidateEmail(email) == true) {
			System.out.println("Email id is Correct");
		} else {
			System.out.println("Email id  is Incorrect ");
		}
	}

}

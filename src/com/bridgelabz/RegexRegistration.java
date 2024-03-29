package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRegistration {

	public static boolean isFirstName(String firstName) {

		String Regex_FirstName = "^[A-Z]{1}[a-z]{2,}";
		Pattern pattern = Pattern.compile(Regex_FirstName);

		if (firstName == null) {
			return false;
		}
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}

	public static boolean isLastName(String lastName) {

		String Regex_LastName = "^[A-Z]{1}[a-z]{2,}";
		Pattern pattern = Pattern.compile(Regex_LastName);

		if (lastName == null) {
			return false;
		}
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
	}
	
	public static boolean isValidateEmail(String email) {
		String Regex_Email = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";
		Pattern pattern = Pattern.compile(Regex_Email);
		if (email == null) {
			return false;
		}
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public static boolean isMobileFormatValid(String mobileNumber) {
		String Regex_Number = "^((\\+)?(\\d{2}[\\s]))?(\\d{10}){1}?$";
		Pattern pattern = Pattern.compile(Regex_Number);
		if (mobileNumber == null) {
			return false;
		}
		Matcher matcher = pattern.matcher(mobileNumber);
		return matcher.matches();
	}

	public boolean isPasswordValid(String password) {
		String Regex_Password = "^((\\\\+)?(\\\\d{2}[\\\\s]))?(\\\\d{10}){1}?$";
		Pattern pattern = Pattern.compile(Regex_Password);
		if (password == null) {
			return false;
		}
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}
}

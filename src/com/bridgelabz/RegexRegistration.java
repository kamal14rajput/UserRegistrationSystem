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
}

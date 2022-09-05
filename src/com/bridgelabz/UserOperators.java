package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserOperators {
	public void firstName(String firstName) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		boolean valid = matcher.matches();
		if (valid == true) {
			System.out.println("Your name " + firstName + " is Valid");
		} else {
			System.out.println("Your name " + firstName + " is Invalid");
		}
	}

	public void lastName(String lastName) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		boolean valid = matcher.matches();
		if (valid == true) {
			System.out.println("Your Last name " + lastName + " is Valid");
		} else {
			System.out.println("Your Last name " + lastName + " is Invalid");
		}
	}

	public void emailaddress(String emailaddress) {
		String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(emailaddress);
		boolean valid = matcher.matches();
		if (valid == true) {
			System.out.println("Your Email Address " + emailaddress + " is Valid");
		} else {
			System.out.println("Your Email Address " + emailaddress + " is Invalid");
		}
	}

	public void phoneNo(String phoneNo) {
		String regex = "^[0-9]{2} [6-9]{1}[0-9]{9}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(phoneNo);
		boolean valid = matcher.matches();
		if (valid == true) {
			System.out.println("Your Phone Number " + phoneNo + " is Valid");
		} else {
			System.out.println("Your Phone Number " + phoneNo + " is Invalid");
		}
	}

	public void passward(String passward) {
		// String regex = "^[0-9a-zA-Z]{8,}$";
		// String regex = "^(?=.*[A-Z]){1}(?=.*[a-z]).{8,}$";
		// String regex = "^(?=.*[A-Z]){1}(?=.*[a-z])(?=.*[0-9]).{8,}$";
		String regex = "^(?=.*[A-Z]){1}(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%!]).{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(passward);
		boolean valid = matcher.matches();
		if (valid == true) {
			System.out.println("Your Passward " + passward + " is Valid");
		} else {
			System.out.println("Your Passward " + passward + " is Invalid");
		}
	}
}



package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

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

}


package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name: ");
		String firstName = sc.next();
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher match = pattern.matcher(firstName);
		if (match.find() && match.group().equals(firstName)) {
			System.out.println("valid FirstName");
		} else {
			System.out.println("invalid FirstName");
		}

	}

}

package week2;

import java.util.*;

public class StringMethod {
	public static void main(String[] args) {
		/*Develop a Java program to accept a string and display
		the output after applying the following methods: charAt(), length(), toUpperCase(),
		toLowerCase(), substring(), contains().*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		System.out.println("Character At Index 2: " + str.charAt(2));
		System.out.println("Length of string str: " + str.length());
		System.out.println("After converting the string to uppercase: " + str.toUpperCase());
		System.out.println("After converting the string to lowercase: " + str.toLowerCase());
		System.out.println("Substring (0-3): " + str.substring(0, 3));
		System.out.print("Enter a substring to check: ");
		String sub = sc.nextLine();
		System.out.println("Contains '" + sub + "' : " + str.contains(sub));
		sc.close();
	}

}

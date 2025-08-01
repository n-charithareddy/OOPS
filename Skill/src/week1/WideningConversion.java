package week1;

import java.util.*;

public class WideningConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int intVal = sc.nextInt();
		long longVal = intVal;
		float floatVal = longVal;
		System.out.println("Original int value: " + intVal);
		System.out.println("After widening to long: " + longVal);
		System.out.println("After widening to float: " + floatVal);
	}

}

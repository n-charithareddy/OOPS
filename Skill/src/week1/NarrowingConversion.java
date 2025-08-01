package week1;

import java.util.*;

public class NarrowingConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double doubleVal = sc.nextDouble();
		int intVal = (int) doubleVal;
		System.out.println("Original value: " + doubleVal);
		System.out.println("After narrowing value is: " + intVal);
	}

}

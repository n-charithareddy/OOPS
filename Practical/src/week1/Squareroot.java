package week1;

import java.util.*;

public class Squareroot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("Square root of " + i + " is " + Math.sqrt(i));
		}
		sc.close();
	}
}
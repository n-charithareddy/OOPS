package week1;

import java.util.*;

public class Swap {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of apples Tom and Jerry have: ");
		int t = sc.nextInt();
		int j = sc.nextInt();
		System.out.println("Before swapping Tom has " + t + " apples and Jerry has " + j + " apples");
		int temp = t;
		t = j;
		j = temp;
		System.out.println("After swapping Tom has " + t + " apples and Jerry has " + j + " apples");
		sc.close();
	}
	
}
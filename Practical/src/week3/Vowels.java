package week3;
import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String str = sc.nextLine();
		int count = 0;
		str = str.toLowerCase();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
			}
		}
		System.out.println("Number of vowels: " + count);
	}

}

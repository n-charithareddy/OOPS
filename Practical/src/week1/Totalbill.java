package week1;

import java.util.*;

public class Totalbill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total bill, gst (in %) and maintenance charges (in %): ");
		float bill = sc.nextFloat();
		float gst = sc.nextInt();
		float maintenance = sc.nextInt();
		bill = bill + (gst/100) + (maintenance/100);
		if(bill > 1000) {
			bill -= (bill*0.10);
		}
		else {
			bill -= (bill*0.05);
		}
		System.out.println("Total bill is: " + bill);
		System.out.println("GST charges: " + bill*(gst/100));
		System.out.println("Maintenance charges: " + bill*(maintenance/100));
		sc.close();
	}
}

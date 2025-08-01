package week1;

import java.util.*;

public class WrapperClasses {

	public static void main(String[] args) {
		//auto boxing
		int b = 37;
		Integer a;
		a = b;
		System.out.println("The primitive value of b is " + b);
		System.out.println("The Integer object of a is " + a);
		//un-boxing
		Integer i = new Integer(3);
		int j = i;
		System.out.println("The Integer object of i is "+ i);
		System.out.println("The primitive value of j is " + j);
	}
}

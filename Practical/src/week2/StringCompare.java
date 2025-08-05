package week2;

public class StringCompare {

	public static void main(String[] args) {
		/*Develop a Java program to create 2 string objects, assign values to them and
		 * demonstrate equals() and = = .
		 */
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = "World";
		
		System.out.println("str1.equals(str2): " + str1.equals(str2));
		System.out.println("str1.equals(str3): " + str1.equals(str3));
		System.out.println("str1.equals(str4): " + str1.equals(str4));
		
		System.out.println("str1 == str2 : " + str1 == str2);
		System.out.println("str1 == str3 : " + str1 == str3);
		System.out.println("str1 == str4 : " + str1 == str4);
	}

}

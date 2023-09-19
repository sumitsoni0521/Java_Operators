public class assignmentOperators {
	public static void main(String[] args) {
		int asgn = 5;

		System.out.println("asgn += 3: " + (asgn += 3));
		System.out.println("asgn -= 2: " + (asgn -= 2));
		System.out.println("asgn *= 4: " + (asgn *= 4));
		System.out.println("asgn /= 3: " + (asgn /= 3));
		System.out.println("asgn %= 2: " + (asgn %= 2));

		System.out.println("\n");

		System.out.println("asgn &= 0b1010: " + (asgn &= 0b1010));
		System.out.println("asgn |= 0b1100: " + (asgn |= 0b1100));
		System.out.println("asgn ^= 0b1010: " + (asgn ^= 0b1010));

		System.out.println("\n");

		System.out.println("asgn <<= 2: " + (asgn <<= 2));
		System.out.println("asgn >>= 1: " + (asgn >>= 1));

		System.out.println("\n");
		
		System.out.println("asgn >>>= 1: " + (asgn >>>= 1));
	}
}




// Java code to illustrate "%="

//import java.io.*;

//class Assignment {
//	public static void main(String[] args)
//	{

//		// Declaring variables
//		int num1 = 5, num2 = 3;

//		System.out.println("num1 = " + num1);
//		System.out.println("num2 = " + num2);

//		// Moduling & Assigning values
//		num1 %= num2;

//		// Displaying the assigned values
//		System.out.println("num1 = " + num1);
//	}
//}

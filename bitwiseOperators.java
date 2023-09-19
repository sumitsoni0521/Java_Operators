public class bitwiseOperators {
	public static void main(String[] args) {
		// Java Program to implement
		// bitwise operators

		// Bitwise operators
		int d = 52;
		int e = 25;
		System.out.println("d & e: " + (d & e));
		System.out.println("d | e: " + (d | e));
		System.out.println("d ^ e: " + (d ^ e));
		System.out.println("~d: " + (~d));
		System.out.println("d << 2: " + (d << 2));
		System.out.println("e >> 1: " + (e >> 1));
		System.out.println("e >>> 1: " + (e >>> 1));
	}
}
// Bitwise Operators:-
// These operators are used to perform the manipulation of individual bits of a
// number.
// They can be used with any of the integer types.
// They are used when performing update and query operations of the Binary
// indexed trees.

// &, Bitwise AND operator: returns bit by bit AND of input values.
// |, Bitwise OR operator: returns bit by bit OR of input values.
// ^, Bitwise XOR operator: returns bit-by-bit XOR of input values.
// ~, Bitwise Complement Operator: This is a unary operator which returns the
// one’s
// complement representation of the input value, i.e., with all bits inverted.




//import java.util.Scanner;

//public class BitwiseOperators {
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);

//		System.out.print("Enter first number: ");
//		int num1 = input.nextInt();

//		System.out.print("Enter second number: ");
//		int num2 = input.nextInt();

//		System.out.println("Bitwise AND: " + (num1 & num2));
//		System.out.println("Bitwise OR: " + (num1 | num2));
//		System.out.println("Bitwise XOR: " + (num1 ^ num2));
//		System.out.println("Bitwise NOT: " + (~num1));
//		System.out.println("Bitwise Left Shift: " + (num1 << 2));
//		System.out.println("Bitwise Right Shift: " + (num1 >> 2));
//		System.out.println("Bitwise Unsigned Right Shift: " + (num1 >>> 2));

//		input.close();
//	}
//}

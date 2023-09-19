public class unaryOperators {
	// Unary Operators are : "–" : Unary minus , "+" : Unary plus , "++" : Increment
	// operator , "– –" : Decrement operator, "!" : Logical not operator
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		// Using uniary operators
		System.out.println("Postincrement : " + (a++));
		System.out.println("Preincrement : " + (++a));

		System.out.println("Postdecrement : " + (b--));
		System.out.println("Predecrement : " + (--b));
	}
}



//import java.util.Scanner;
//public class UnaryOperators {
//	public static void main(String[] args)
//	{
//		Scanner sc = new Scanner(System.in);

//		// fro user inputs here is the code.

//		// System.out.print("Enter a number: ");
//		// int num = sc.nextInt();
//		int num = 10;

//		int result = +num;
//		System.out.println(
//			"The value of result after unary plus is: "
//			+ result);

//		result = -num;
//		System.out.println(
//			"The value of result after unary minus is: "
//			+ result);

//		result = ++num;
//		System.out.println(
//			"The value of result after pre-increment is: "
//			+ result);

//		result = num++;
//		System.out.println(
//			"The value of result after post-increment is: "
//			+ result);

//		result = --num;
//		System.out.println(
//			"The value of result after pre-decrement is: "
//			+ result);

//		result = num--;
//		System.out.println(
//			"The value of result after post-decrement is: "
//			+ result);
//	}
//}

//The ternary operator is a shorthand version of the if-else statement. 
//It has three operands and hence the name Ternary. The general format is:

//condition ? if true : if false

//The above statement means that if the condition evaluates to true, 
//then execute the statements after the ‘?’ else execute the statements after the ‘:’.  
public class ternaryOperators {
	public static void main(String[] args) {
		int a = 20, b = 10, c = 30, result;
		result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
		System.out.println("Max. of three numbers : " + result);
	}
}
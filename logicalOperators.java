public class logicalOperators {
	public static void main(String[] args) {
		boolean x=true;
		boolean y= false;
		
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
	}
}
//These operators are used to perform “logical AND” and “logical OR” operations, i.e., 
//a function similar to AND gate and OR gate in digital electronics. 
//One thing to keep in mind is the second condition is not evaluated if the first one is false, i.e., it has a short-circuiting effect. 
//Used extensively to test for several conditions for making a decision. Java also has “Logical NOT”,
//which returns true when the condition is false and vice-versa

//Conditional operators are:-
//&&, Logical AND: returns true when both conditions are true.
//||, Logical OR: returns true if at least one condition is true.
//!, Logical NOT: returns true when a condition is false and vice-versa
//Shift Operators
//<<, <<<, >>
//eg: let's 2 :- (in_binary_formate)0000 0010  then :-
//left_shift by 1 :- (binary_formate)0000 0100 - 4(decimal_formate).
//left shift by 2:- (binary_formate)0000 1000 - 8(decimal_formate).
//eg: let's 8 :- (in_binary_formate)0000 1000  then :-
//right shfit by 1:- (binary_formate)0000 0100 - 4(decimal formate).
//right shfit by 2:- (binary_formate)0000 0010 - 2(decimal formate).

//These operators are used to shift the bits of a number left or right, thereby multiplying or dividing the number by two, respectively. 
//They can be used when we have to multiply or divide a number by two. General format- 
//number shift_op number_of_places_to_shift;

//<<, Left shift operator: shifts the bits of the number to the left and fills 0 on voids left as a result.
// Similar effect as multiplying the number with some power of two.
//>>, Signed Right shift operator: shifts the bits of the number to the right and fills 0 on voids left as a result. 
//The leftmost bit depends on the sign of the initial number. Similar effect to dividing the number with some power of two.
//>>>, Unsigned Right shift operator: shifts the bits of the number to the right and fills 0 on voids left as a result. 
//The leftmost bit is set to 0.
public class shiftOperators {
	public static void main(String[] args) {
		int a = 10;
     
          // using left shift
        System.out.println("a<<1 : " + (a << 1));
       
        // using right shift
        System.out.println("a>>1 : " + (a >> 1));
	}
}

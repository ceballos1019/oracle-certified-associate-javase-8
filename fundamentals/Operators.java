package fundamentals;

import java.util.Random;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 * Class to show the different kind of operators
 * @author Andres Ceballos Sanchez
 * @since 2019/01/28
 * @version 1.0
 */
public class Operators {    

    /**
     * Shows the unary operators 
     */
    public static void showUnaryOperators() {
        System.out.println("===============");
        System.out.println("UNARY OPERATORS");
        System.out.println("===============");
        
        //Minus
        int plusOp = +10;
        int minusOp = -plusOp; //return the negative of its operand
        System.out.println("Using the minus operator: " + minusOp);

        /**For unary operators, if the type of the operand is byte,
         * short, or char, the outcome is promoted to int.*/
        byte byteNum = 5;
        byte errNum = -byteNum; //Error because the result is promoted to int
        

        //Plus
        int minusOp2 = -10;
        int plusOp2 = +minusOp2; //return the value of its operand
        System.out.println("Using the plus operator: " + plusOp2);

        //Increment/Decrement
        int toIncrementPre = 1;
        int toIncrementPost = 1;
        int prefixIncrement = ++toIncrementPre;
        int postfixIncrement = toIncrementPost++;         
        System.out.println("Incrementing with prefix: " + prefixIncrement);
        System.out.println("Incrementing with postfix: "+ postfixIncrement);

        //Logical
        boolean logicalOp = !false; //Invert the boolean value
        System.out.println("Inverting the value: (!false) " + logicalOp);

        //Bitwise
        int bitOp  = 2;
        int result = ~bitOp; //convert the operand to a binary number and reverse all bits
        System.out.println("Bitwise in action: " + result);
    }

    public static void showsArithmeticOperators() {
        System.out.println("====================");
        System.out.println("ARITHMETIC OPERATORS");
        System.out.println("====================");

        //Addition
        byte x = 3;
        int y =  x + 5; //Adds two operands
        System.out.println("Addition result: " + y);
        int j = 2_000_000_000;
        int k = j + j; //Not enough capacity!
        System.out.println("Bug: " + k);

        //Substraction
        long a = 2000l;
        int b = (int) a - 300; //performs substraction between two operands
        System.out.println("Substraction result: " + b);

        //Multiplication
        short c = 103;
        int d = c * 3; //perform multiplication between two operands
        System.out.println("Multiplication result: " + d);

        //Division
        int e = 20;
        int f = e / 8; //perform division between two operators

        //Result is always an integer, the remainder will be ignored
        System.out.println("Division result: " + f); 
        System.out.println("Dividing by zero: " + (20 / 0)); //Not allowed: ArithmeticException

        //Modulus
        int g = e % 8;
        System.out.println("Modulus result: " + g);
    }

    public static void showsRelationalOperators() {
        System.out.println("====================");
        System.out.println("RELATIONAL OPERATORS");
        System.out.println("====================");

        int a = 20, b = 10; 
        String x = "Thank";
        String y = "Thank"; 
        int ar[] = { 1, 2, 3 }; 
        int br[] = { 1, 2, 3 }; 
        boolean condition = true; 
  
        //There are various relational operators. All of them return a boolean
        System.out.println("a == b :" + (a == b)); 
        System.out.println("a < b :" + (a < b)); 
        System.out.println("a <= b :" + (a <= b)); 
        System.out.println("a > b :" + (a > b)); 
        System.out.println("a >= b :" + (a >= b)); 
        System.out.println("a != b :" + (a != b)); 
  
        // Arrays cannot be compared with relational operators because objects 
        // store references not the value 
        System.out.println("ar == br : " + (ar == br));
        System.out.println("x == y : " + (x == y));  
        System.out.println("condition==true :" + (condition == true));

        //instance of operator is used for type checking
        Random random = new Random();
        if(random instanceof List) {
            System.out.println("It is instance of List!"); //This line is not executed
        }        
    }

    public static void showsConditionalOperators() {
        System.out.println("=====================");
        System.out.println("CONDITIONAL OPERATORS");
        System.out.println("=====================");

        // &&, || and ? : operators

        boolean firstCondition = true;
        boolean secondCondition = false;
        boolean andResult = firstCondition && secondCondition; //true when both conditions are true
        boolean orResult = firstCondition || secondCondition; //true if at least one condition is true

        System.out.println("TRUE && FALSE: " + andResult);
        System.out.println("TRUE || FALSE: " + orResult);

        //shorthand of if-else statement
        int ifResult = (8 > 4) ? 2 : 4;
        int elseResult = (8 < 4) ? 2 : 4;

        System.out.println("If result: " + ifResult);
        System.out.println("Else result: " + elseResult);        
    }

    public static void showsShiftOperators() {
        /*Left shift operator: shifts a number to the left, 
        padding the rights bits with 0
        0001 << 3 => 1000 == 2^3 *
        if the left-hand operand is:
            int: only the first five bits are used
            long: only the first six bits are used*/
        int leftShiftOp = 1 << 3;
        System.out.println("1 << 3: " + leftShiftOp);

        /* Right shift operator: shits the left hand operand to the right
        0001 0000 >> 3 => 0000 0010 == 16/(2^3) */
        int rightShiftOp = 16 >> 3;
        System.out.println("16 >> 3: " + rightShiftOp);

        /* Unsigned right shift operator: n >>> s 
            if n is positive , value is the same as n >> s
            if n is negative, the value depends on the type of n
                if n is an int, value is (n >> s) + (2 << ~s)
                if n is a long, value is (n >> s) + (2L << ~s)*/
    }

    public static void main(String[] args) {
        showUnaryOperators();
        showsArithmeticOperators();
        showsRelationalOperators();
        showsConditionalOperators();
        showsShiftOperators();
    }

}
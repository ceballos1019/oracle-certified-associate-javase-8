package fundamentals;
/**
 * Show the usage of java separators
 * @author Andres Ceballos Sanchez - andresrxn10@hotmail.com
 * @since 09/01/2019
 * @version 1.0
 */
public class Separators {

    /* Parentheses () are used in: */
    //Method signatures to contain list of arguments
    public void testParentheses(String argument1, String argument2, String argument3) {}
    //Expressions to raise operator precedence
    int a = 0 * (1 + 3);
    //Narrowing conversions
    long numberA = 20L;
    int numberB = (int) numberA;
    //Loops to contain expressions to be evaluated    
    public void testLoop() {
        boolean expressionA = false;
        while(expressionA == true) {};
    }


    /* Braces {} are used in: */
    //Declaration of types
    //Blocks of statements
    public void testBlock(String test) {};
    //Array Initialization
    int [] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23};


    /* Brackets [] are used in*/
    //Array Declaration
    String [] declaredArray;
    //Array value dereferencing
    String [] cars = {"BMW", "AUDI", "TOYOTA"};
    String favoriteCar = cars[1];
}
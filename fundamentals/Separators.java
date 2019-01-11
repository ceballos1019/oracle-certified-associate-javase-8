package fundamentals;

import java.util.Collections;
import java.util.List;

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

    /* Angle brackets <> */
    //Used to pass parameter to parameterized types
    class GenericClass<T> {}
    GenericClass<String> stringGeneric = new GenericClass<>();

    /* Semicolon ; */
    //Used to terminate statements
    String statement = "Ending with semicolon";
    //In the for statement, used to separate the initialization code, expression and update code
    public void testSemicolon() {
        for(int i = 0; i < Integer.MIN_VALUE; i++){}
    }

    /* Colon : */
    //Used in for statement that iterates over an array or a collection
    public void testColon() {
        List<Integer> numbers = Collections.emptyList();
        for(Integer number : numbers) {
            System.out.println(number);
        }
    }

    /* Comma , */
    //Used to separate arguments in method declaration
    public void testComma(String argument1, String argument2, String argument3){}

    /* Period . */
    //Used to select a field or method from a reference variable
    public void testPeriod() {
        String variable = new String();
        variable.getBytes();        
    }
}
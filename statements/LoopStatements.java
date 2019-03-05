package statements;

import java.util.ArrayList;

/**
 * Shows the different kind of loops statements
 * @author Andres Ceballos Sanchez - andresrxn10@hotmail.com
 * @version 1.0
 * @since 2019/02/18
 */
public class LoopStatements {

    /**
     * Shows basic syntax of wile loop
     */
    public void whileSyntax() {
        int i = 0;
        while(i < 3) {
            System.out.println(i);
            i++;
        }
    }

    /**
     * Sometimes you use an expression that always evaluate to true,
     * such as the boolean literal true, but relies on the break statement
     * to escape from the loop
     */
    public void whileLoopWithBreak() {
        int k = 0;
        while(true) {
            System.out.println(k);
            k++;
            if(k > 2) {
                break;
            }
        }
    }

    /**
     * Exit control loop that checks condition after executing the statements
     */
    public void doWhileLoopSyntax() {
        int i = 0;
        do {
            System.out.println(i);
        } while(i < 3);
    }

    /**
     * The following code demonstrates that at least the code in the do block
     * will be executed once even though the initial value of j used to test
     * the expression is false
     */
    public static void doWhileLoopAtLeastOneExecution() {
        int j = 4;
        do {
            //This line wil be printed even if the condition is false
            System.out.println("I was executed at least once!");
            j++;
        } while(j < 3);
    }

    /**
     * Shows the for loop structure: initialization, condition and update
     * Benefits: shorter, easy to debug structure of looping
     */
    public void forLoopSyntax() {
        for(int x = 2; x <= 4; x++) {
            System.out.println("Value of x: " + x);
        }

        //When the variable is declared in the initialization part,it will be
        //visible only in the loop
        System.out.println("Value of x outside the loop: " + x);
    }

    /**
     * The initialization part of the for statement is optional
     * It can be declared outside the loop
     */
    public void forLoopWithoutInitializationPart() {
        int j = 0;
        for( ; j < 3; j++) {
            System.out.println(j);
        }

        //j is visible here because it was declared outside the loop
        System.out.println(j);
    }

    /**
     * Update part is optional.
     * The following for statement moves the update statement to the end
     * of the statement block
     */
    public void forLoopWithoutUpdatePart() {
        int k = 0;
        for( ; k < 3; ) {
            System.out.println(k);
            k++; //update part
        }
    }
    
    /**
     * You can even omit the condition part and terminate the loop with the break statement
     */
    public void forLoopWihoutConditionPart() {
        int m = 0;
        for( ; ; ) {
            System.out.println(m);
            m++;
            if(m > 4) {
                break;
            }
        }
    }
    /* Pitfalls */

    /**
     * Show examples of infinite loops
     */
    public static void infiniteLoop() {

        /* Infinite loop because condition is not apt*/        
        for(int i = 5; i != 0; i -= 2) {
            System.out.println(i);
        }

        /* Infinite loop because update statement is not provided*/
        int x = 5;
        while(x == 5) {
            System.out.println("I'm in the loop");
        }
    }

    /**
     * Shows how to generate an out of memory exception from a loop
     */
    public static void outOfMemoryError() {
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0; i < Integer.MAX_VALUE; i++) {
            array.add(i);
        }
    }


    public static void main(String[] args) {
        doWhileLoopAtLeastOneExecution();

        //Uncomment following line to enable an infinite loop
        //infiniteLoop();

        //Uncomment following line to thrown an OutOfMemoryError
        //outOfMemoryError();
    }

}
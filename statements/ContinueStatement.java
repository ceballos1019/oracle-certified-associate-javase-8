package statements;

/**
 * Shows examples about using the continue keyword
 * @author Andres Ceballos Sanchez - andresrxn10@hotmail.com
 * @version 1.0
 * @since 2019/02/19
 */
public class ContinueStatement {

    /**
     * Illustrates using continue statement in an if statement
     * to print only odd numbers
     */
    public static void continueBasicUsage() {
        for (int i = 0; i < 10; i++) {
            
            //If number is even, skip and continue with the next iteration
            if(i % 2 == 0) {
                continue;
            }

            //If number is odd, print it
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Use the continue statement outside a loop generates a compile error
     */
    public void continueCompilerError() {
        int a = 0;
        if(a == 0) {
            a++;
            continue; //compile error
            a--;
        }
        
    }

    /**
     * Shows that continue, when used inside a set of nested loops,
     * will only apply to the innermost loop
     */
    public static void breakNestedLoops() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(j == 2) {
                    continue;
                }
                System.out.println("I'm the inner loop with the value of: " + j);
            }
            System.out.println("I'm in the outer loop with the value of: " + i);
        }
    }

    public static void main(String[] args) {
        continueBasicUsage();
        breakNestedLoops();
    }

}
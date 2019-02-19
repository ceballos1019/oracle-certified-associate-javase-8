package statements;

/**
 * Shows examples about using the break keyword
 * @author Andres Ceballos Sanchez - andresrxn10@hotmail.com
 * @version 1.0
 * @since 2019/02/19
 */
public class BreakStatement {

    /**
     * Illustrates using break to exit a loop
     */
    public static void breakBasicUsage() {
        // Initially loop is set to run from 0-9 
        for (int i = 0; i < 10; i++) 
        { 
            // terminate loop when i is 5. 
            if (i == 5) 
                break; 
  
            System.out.println("i: " + i); 
        } 
        System.out.println("Loop complete."); 
    }

    /**
     * Illustrates using break with goto
     */
    public static void breakWithGoTo() {
        boolean t = true;

        first: {
            //Illegal statement here as label second is not introduced yet
            //break second; 
            second: {
                third: {
                    //Before break
                    System.out.println("Before the break statement");

                    //break will take the control out of second label
                    if(t) {
                        break second;
                    }
                    System.out.println("This won't execute in the third label.");
                }
                System.out.println("This won't execute in the second label.");
            }
            System.out.println("This is after second block.");
        }
    }

    /**
     * Use the break statement outside an enclosing do, while, for 
     * or switch statement generates a compile error
     */
    public void breakCompilerError() {
        int a = 1 + 2;
        a++;
        break; //compile error
        a--;
        
    }

    /**
     * Shows that break, when used inside a set of nested loops,
     * will only break out of the innermost loop
     */
    public static void breakNestedLoops() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(j == 2) {
                    break;
                }
                System.out.println("I'm the inner loop with the value of: " + j);
            }
            System.out.println("I'm in the outer loop with the value of: " + i);
        }
    }

    public static void main(String[] args) {
        breakBasicUsage();
        breakWithGoTo();
        breakNestedLoops();
    }

}
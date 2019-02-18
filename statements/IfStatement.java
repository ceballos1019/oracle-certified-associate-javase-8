package statements;

/**
* Shows the structure and usage of if statement
* @author Andres Ceballos Sanchez - andresrxn10@hotmail.com
* @version 1.0
* @since 2019/02/18
 */
public class IfStatement {

    /**
     * Shows the conditional if statement.
     * The syntax is either one of these two
     */
    public void basicStructure() {
        /* Simple If Statement */
        int numberA = 10;   
        int numberB = 19;     
        if(numberA > numberB) {
            //Statements to be executed if condition is true
        }

        /* If Else Statement */        
        if(numberB == numberA) {
            //Do something if booleanExpression is true
        } else {
            //Otherwise do this
        }
    }

    /**
     * If you are evaluating a boolean value in your if statement, 
     * it's not necessary to use the == operator
     */
    public void evaluatingBooleanValues() {
        boolean trueBooleanValue = true;
        boolean falseBooleanValue = false;
        if(trueBooleanValue) {
            //Do something
        }

        if(!falseBooleanValue) {
            //Do something
        }
    }

    /**
     * If there is only one statement in an if or else block, 
     * the braces are optional
     * NOTE: This is possible but not recommended. Using braces makes your code clearer
     */
    public static void optionalBraces() {
        int a = 0;
        if(a > 3) 
            a++;
        else
            a = 3;


        //Here if the condition is true, if block will consider only statement 1
        boolean condition = false;
        if(condition)
            System.out.println("I'm in if");
            System.out.println("I0m not in if");
    }

    /**
     * If there are multiple selections, you can also use if with a series of else statements
     */
    public void multipleSelections() {
        int option = 4;
        if(option == 1) {
            System.out.println("One");
        } else if(option == 2) {
            System.out.println("Two");
        } else if(option == 3) {
            System.out.println("Three");
        } else {
            System.out.println("Four");
        }

    }
    
    public static void main(String[] args) {
        optionalBraces();
    }

}
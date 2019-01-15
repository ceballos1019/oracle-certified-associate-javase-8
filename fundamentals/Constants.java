package fundamentals;

/**
 * Shows how to declare and use a constant. Shows the usage of final keyword
 * @author Andres Ceballos Sanchez - andresrxn10@hotmail.com
 * @since 2019/01/14
 * @version 1.0
 */
public class Constants {
    /**
     * Declare a constant by using the keyword final    
     * We have to perform intialization explicitly because the JVM
     * won't provide a default value for static final variables
     */
    static final int CONSTANT; //Error because it has to be initialized
    static int NO_CONSTANT; //No error because it is not declared as final

    //final static variable can be initialized at the time of declaration
    static final int AT_DECLARATION = 10; 

    //final static variable can also be initialized inside static block
    static final int AT_STATIC_BLOCK;
    static {
        AT_STATIC_BLOCK = 20;
    }

    //final variable can be initialized inside instance initializer block
    final int AT_INSTANCE_BLOCK;
    {
        AT_INSTANCE_BLOCK = 30;
    }

    /**
     * final variable can be initialized inside the constructor
     * If you have more than one constructor in your class
     * then it must be initialized in all of them          
     */
    final int AT_CONSTRUCTOR;

    public Constants() {
        AT_CONSTRUCTOR = 1;
    }

    public Constants(int randomNumber) {
        AT_CONSTRUCTOR = randomNumber;
    }
    

    public static void main(String[] args) {
        System.out.println("INITIALIZED AT DECLARATION: " + AT_DECLARATION);
        System.out.println("INITIALIZED INSIDE STATIC BLOCK: " + AT_STATIC_BLOCK);    
        AT_DECLARATION = 5; //re-assigning final variable will throw error
        
        /**
         * When a final variable is created inside a method/constructor/block, 
         * it is called local final variable, and it must initialize once where it is created. 
         */
        final int localFinalVariable;
        localFinalVariable = 3;
        System.out.println(localFinalVariable);

        /*foreach with final*/
        int arr[] = {1, 2, 3};
        for(final int i: arr) {
            System.out.println(i);
        }
    }

    /**
     * When a class is declared final it cannot be extended (inherited)
     * The other use of final with classes is to create an immutable class
     */
    final class A {}
    class B extends A {} //Error because can't subclass A

    /**
     * A final method cannot be overridden. 
     */
    class C {
        final void method1() {
            System.out.println("This is a final method");
        }
    }

    class D extends C {
        void method1() {
            //Compile error: can't override
            System.out.println("Illegal!");
        }
    }
    
}
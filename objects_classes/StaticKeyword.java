package objects_classes;

/**
 * Shows the usage of the static keyword
 * @author Andres Ceballos Sanchez - andresrxn10@hotmail.com
 * @version 1.0
 * @since 2019/04/22
 */
public class StaticKeyword {

    static int a = 10;
    static int b;

    public static void main(String[] args) {
        beforeInstantiating();
        showingStaticBlocks();
    }

    /**
     * Demonstrate that a static member can be accessed before instantiating a class
     */
    static void beforeInstantiating() {
        System.out.println("I'm being executed before instantiating the class!");
    }

    static {
        System.out.println("Static block initializing...");
        b = a * 4;
    }

    /**
     * Demonstrate execution of static blocks and variables
     */
    static void showingStaticBlocks() {
        System.out.println("Showing the static block initialization");
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }

    static int staticVar = 10; //static variables
    int nonStaticVar = 20; //instance variable

    /**
     * Demonstrate restrictions on static methods
     */
    static void restrictionsForStaticMethods() {
        staticVar = 20;
        System.out.println("From restrictions method");

        // Cannot make a static reference to the non-static field nonStaticVar
        nonStaticVar = 10; //compiler error

        //Cannot make a static reference to the non-static method nonStaticMethod() from the type StaticKeyword
        nonStaticMethod();  //compiler error
        
    }

    void nonStaticMethod() {
        System.out.println("I'm a non static method!");
    }

}
package objects_classes;

/**
 * Shows examples to understand the java main method
 * @author Andres Ceballos Sanchez - andresrxn10@hotmail.com
 * @version 1.0
 * @since 2019/04/13
 */
public class MainMethod {

    //You can use String []args or String... args
    //public static void main(String... args){}

    /**
     * It has to be public so the java runtime can execute this method
     * Error: Main method not found in the class
     */
    static void notPublicMain(String[] args) {
        System.out.println("I need to be public");
    }

    /**
     * It has to be static so that JVM can load the class into memory
     * and call the main method without an object of the class
     * Error: Main method is not static in the class
     * @param args
     */
    public void notStaticMain(String[] args) {
        System.out.println("I need to be static");
    }

    /**
     * Compilation error as unexpected return value.
     * @param args
     */
    public static void main(String[] args) {
        return 0;
    }

    /**
     * It has to be called 'main'. When we start a java program, 
     * it looks for the main method
     * Error: Main method not found in the class
     * @param args
     */
    public static void myMain(String[] args) {
        System.out.println("My name must be 'main'");
    }


}
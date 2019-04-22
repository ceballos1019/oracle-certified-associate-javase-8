package objects_classes;

/**
 * Demonstrate that static block is executed before main()
 * @author Andres Ceballos Sanchez - andresrxn10@hotmail.com
 * @version 1.0
 * @since 2019/04/13
 */
public class StaticBlock {

    //static block
    static {
        System.out.println("Inside static block!");
    }

    //main method
    public static void main(String[] args) {
        System.out.println("Inside main method!");
    }

}
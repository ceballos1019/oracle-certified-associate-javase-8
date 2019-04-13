package objects_classes;

/**
 * Shows the type of constructors
 * @author Andres Ceballos Sanchez - andresrxn10@hotmail.com
 * @version 1.0
 * @since 2019/04/13
 */
public class Constructors {

    private int number;

    //No argument constructors, known as default constructor
    public Constructors() {
        //Initialize with fixed values for all objects.
        this.number = 10;
    }

    //Parameterized constructors
    public Constructors(int num) {
        //Initialize object with num param
        this.number = num;
    }

    //A constructor cannot be abstract, final, static and Synchronized
    public static final synchronized Constructors() {}

    public Constructors(int numA, int numB) {
        this.number = numA * numB;
        return;
    }

    public void test() {
        return;
    }
}
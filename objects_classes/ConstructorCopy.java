package objects_classes;

/**
 * Shows a simple use of copy constructor
 * @author Andres Ceballos Sanchez - andresrxn10@hotmail.com
 * @version 1.0
 * @since 2019/04/13
 */
public class ConstructorCopy {

    public int myVariable;

    //A normal parametrized constructor
    public ConstructorCopy(int myVariable) {
        this.myVariable = myVariable;
    }

    //Copy constructor
    public ConstructorCopy(ConstructorCopy objectToCopy) {
        System.out.println("Calling the constructor copy");
        this.myVariable = objectToCopy.myVariable;
    }

    public static void main(String[] args) {
        ConstructorCopy original = new ConstructorCopy(10);

        //Following involves a copy constructor call
        ConstructorCopy copy = new ConstructorCopy(original);

        // Note that following doesn't involve a copy constructor call as  
        // non-primitive variables are just references. 
        ConstructorCopy notCopy = copy;    
    }

}
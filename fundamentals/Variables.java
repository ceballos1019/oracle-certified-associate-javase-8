package fundamentals;

import java.util.List;
import java.util.ArrayList;

/**
 * Describes features about java variables
 * @author Andres Ceballos Sanchez - andresrxn10@hotmail.com
 * @since 12/01/2019
 * @version 1.0
 */
public class Variables {
   
    /* Reference type: provides a reference to an object*/
    String referenceVar = new String();
    String referenceNull = null; //It can be null
    String referenceDefault; //Default value is null
    List<String> referenceType = new ArrayList<>(); //It can refer any object of the declared type or any compatible
    int [] arrayVar; //arrays variables are of reference type
    /**
     * Shows the default value of a reference variable
     */
    public void testDefaultValue() {
        if(referenceDefault == null) {
            System.out.println("Default value of any reference variable is null!");
        }
    }
    

    /* Primitive type: holds a primitive value. It can never be null*/
    int primitiveVar = 0;
    //int primitiveNullError = null; //Error: it cannot be null

    /**
     * When you assign a value to primitive data types, the primitive value is copied, 
     * but when you assign an object to reference type, the handle is copied. 
     * which means for reference type object is not copied only the handle is copied, 
     * i.e. the object is shared between two reference variable, known as aliases. 
     * An implication of this is modification done by one variable will affect to other.
     */
    public static void testAssigning() {
        System.out.println("TEST ASSIGNING");
        System.out.println("==============");
        /* Primitive types*/
        int i = 20;
        int j = i;
        j++; //will not affect i, j will be 21 but i will still be 20

        System.out.printf("value of i and j after modification i: %d, j: %d %n", i, j);

        /* Reference type  */
        List<String> list = new ArrayList<>();
        List<String> copy = list;
        copy.add("TEST");// adding a new element into list, it would be visible to both list and copy
        System.out.printf("value of list and copy after modification list: %s, copy: %s %n", list, copy);        
    }

    /**
     * primitive values are compared but when you compare reference variable, 
     * their address is compared, which means two objects which are logically equal 
     * e.g. two String object with same content may be seen as not equal
     */
    public static void testComparing() {
        System.out.println("\nTEST ASSIGNING");
        System.out.println("==============");
        int i = 20;
        int j = 20;

        if(i == j) {
            System.out.println("i and j are equal");
        }

        String JPY = new String("JPY");
        String YEN = new String("JPY");

        if(JPY == YEN) {
            System.out.println("JPY and YEN are same"); //This line is not printed
        }

        if(JPY.equals(YEN)) {
            //you should always use equals() method to compare reference types.
            System.out.println("JPY and YEN are equal by equals()");
        }
    }

    /**
     * formal parameters are those, which is listed(along with its type) in method declaration
     * e.g. on getName(Employee e) , e is a formal parameter. 
     * While actual parameters are those which are passed to method during invocation
     * e.g. getName(new Employee("John")).
     * 
     * When you pass primitive values to a method the values are passed to the method, 
     * but when you pass reference variable, only the handle is copied. which means for primitives, 
     * changing the formal parameter's value doesn't affect the actual parameter's value, 
     * while in case of reference types, changing the formal parameter's handle doesn't affect the actual 
     * parameter's address but changing the formal parameter's internal values does affect actual 
     * parameter's object, because they refer to the same object in memory.
     */
    public static void testPassingMethodArgument() {
        System.out.println("\nTEST PASSING METHOD ARGUMENT");
        System.out.println("============================");
        int primitiveVar = 0;
        System.out.println("value of 1 before passing to method: " + primitiveVar);
        increasePrimitive(primitiveVar);
        System.out.println("value of 1 after passing to method: " + primitiveVar);

        Counter referenceVar = new Counter();
        System.out.println("counter before passing to method: " + referenceVar.getCount());
        increaseReference(referenceVar);
        System.out.println("counter after passing to method: " + referenceVar.getCount());
    }

    /**
     * increase given primitive value     
     */
    private static void increasePrimitive(int value) {
        value++;
    }

    /**
     * increase given reference value     
     */
    private static void increaseReference(Counter counter) {
        counter.advance(1);
    }

    /**
     * Class to demonstrate diference between primitive and reference type when passing as method arguments
     */
    private static class Counter {
        private int count;

        public void advance(int number) {
            count += number;
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args) {
     testAssigning();
     testComparing();
     testPassingMethodArgument();       
    }
}
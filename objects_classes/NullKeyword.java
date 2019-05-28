package objects_classes;

/**
 * Shows some feature about null literal
 * @author Andres Ceballos Sanchez - andresrxn10@hotmail.com
 * @version 1.0
 * @since 2019/04/15
 */
public class NullKeyword {

    // compile-time error: cannot find symbol NULL
    //Object obj = NULL;

    // Runs successfully
    Object obj1 = null;

    //Null can be assigned to any reference type
    String stringNull = null;
    Integer integerNull = null;
    Double doubleNull = null;

    //Null can be casted to any reference type
    String myStr = (String) null;
    Integer myInt = (Integer) null;
    Double myDbl = (Double) null;

    private static Object defaultObj;

    public static void main(String[] args) {
        /*Default Value*/
        //It will print null
        System.out.println("Value of object is: " + defaultObj);

        /* Autoboxing and unboxing */
        //Exception if a null value is assigned to primitive boxed data type
        Integer i = null;
        //int a = i;

        /* instanceof operator*/        
        Integer isNull = null;
        Integer isNotNull = 10;
        //Prints false
        System.out.println(isNull instanceof Integer);
        //Prints true
        System.out.println(isNotNull instanceof Integer);

        /* Static and non-static methods*/
        //we can call static method with reference variables with null values
        NullKeyword testMethods = null;
        testMethods.staticMethod();
        testMethods.nonStaticMethod();

    }

    private static void staticMethod() {
        System.out.println("I'm a static method and I can be called by null reference!");
    }

    private void nonStaticMethod() {
        System.out.println("I'm a non-static method and I cannot be called by null reference!");
    }
    
}
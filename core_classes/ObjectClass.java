package core_classes;

/**
 * Shows the usage of Object's class methods
 * 
 * @author Andres Ceballos Sanchez - andresrxn10@hotmail.com
 * @version 1.0
 * @since 2019/07/30
 */
public class ObjectClass {

    /**
     * Default beahvior of toString is to print class name, then @, then unsigned
     * hexadecimal representation of the hash code of the object
     */
    public String defaultToString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    /**
     * Whenever we try to print any Object reference, then internally toString()
     * method is called.
     */
    public static void printObjectReference() {
        ObjectClass objectClass = new ObjectClass();

        /* Below two statements are equivalent */
        System.out.println(objectClass);
        System.out.println(objectClass.toString());
    }

    /**
     * Demonstrate working of getClass() method
     */
    public static void printClass() {
        Object object = new String("I'm an object!");
        Class<?> objectClass = object.getClass();
        System.out.println("Class of object is: " + objectClass.getName());
    }

    public void showFinalize() {
        ObjectClass objectClass = new ObjectClass();
        System.out.println(objectClass.hashCode());
        objectClass = null;

        //Calling garbage collector
        System.gc();
        
        System.out.println("End!");
    }

    @Override
    protected void finalize() {
        System.out.println("Finalize method called!");
    }

    public static void main(String[] args) {
        ObjectClass objectClass = new ObjectClass();
        System.out.println("Default toString:" + objectClass.defaultToString());

        System.out.println("\nPrinting Object Reference");
        printObjectReference();

        System.out.println("\nPrinting Class Name");
        printClass();
        
        System.out.println("\nFinalize Example");
        ObjectClass otherObjectClass = new ObjectClass();
        otherObjectClass.showFinalize();        
    }

}
package objects_classes;

/**
 * demonstrate working of method overloading in Java.
 * @author Andres Ceballos Sanchez - andresrxn10@hotmail.com
 * @since 2019/05/16
 * @version 1.0
 */
public class MethodOverloading {

    // Overloaded sum(). This sum takes two int parameters 
    public int sum(int x, int y) {
        return (x + y);
    }

    // Overloaded sum(). This sum takes three int parameters
    public int sum(int x, int y, int z) {
        return (x + y + z);
    }

    // Overloaded sum(). This sum takes two double parameters
    public double sum(double x, double y) {
        return (x + y);
    }

    /* Prototype does not match the arguments*/
    public void show(int x) {
        System.out.println("In int " + x);
    }

    public void show(String s) {
        System.out.println("In String " + s);
    }

    public void show(byte b) {
        System.out.println("In byte " + b);
    }

    /* Static overloading */
    public static void foo() {
        System.out.println("foo() called "); 
    }

    public static void foo(int a) {
        System.out.println("foo(int) called ");
    }

    /* Null Overload Case*/    
    public void fun(Integer i) { 
        System.out.println("fun(Integer ) "); 
    } 

    public void fun(String name) { 
        System.out.println("fun(String ) "); 
    } 

    public static void main(String[] args) {

        /* Basic Overloading*/
        MethodOverloading methodOverloading = new MethodOverloading();
        System.out.println(methodOverloading.sum(10, 20));
        System.out.println(methodOverloading.sum(10, 20, 30));
        System.out.println(methodOverloading.sum(10.5, 20.5));

        /* When prototype does not match with arguments*/
        byte a = 19;
        MethodOverloading mOverloading = new MethodOverloading();
        mOverloading.show(a); //It will go to byte argument
        mOverloading.show("Testing method overloading"); //It will go to the String argument
        mOverloading.show(10); //It will go to the int argument
        mOverloading.show('Z'); //Since char is not available, so the datatype higher than char in terms of range is int
        mOverloading.show("Z"); //It will go to the String argument
        //mOverloading.show(7.5); //Since float datatype is not available and so it's higher datatype, so at this step their will be an error

        /* Static method overloading*/
        MethodOverloading.foo();
        MethodOverloading.foo(7);

        /* Main Overloading*/
        System.out.println("Hi Geek (from main)"); 
        MethodOverloading.main("Geek"); 

        /* Null overloading case*/
        MethodOverloading nullOverloading = new MethodOverloading();
        nullOverloading.fun(null); //Compiler error
    }    
  
    // Overloaded main methods 
    public static void main(String arg1) 
    { 
        System.out.println("Hi, " + arg1); 
        MethodOverloading.main("Dear Geek", "My Geek"); 
    } 
    public static void main(String arg1, String arg2) 
    { 
        System.out.println("Hi, " + arg1 + ", " + arg2); 
    } 

}
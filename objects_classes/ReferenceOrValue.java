package objects_classes;

/**
 * Demonstrate how variables are passed to methods
 * @author Andres Ceballos Sanchez - andresrxn10@hotmail.com
 * @version 1.0
 * @since 2019/05/20
 */
public class ReferenceOrValue {   

    public static void main(String[] args) {  
        
        /* Changes are not reflected back */
        //t is a reference
        Test t = new Test(5);
        //Reference is passed and a copy of reference is created in change()
        change(t);
        //Old value of t.x is printed
        System.out.println(t.x);

        /* Changes are reflected back */
        //t2 is a reference
        Test t2 = new Test(5);
        //Reference is passed and a copy of reference is created in change()
        changeWithReflect(t2);
        //New value of x is printed
        System.out.println(t2.x);
    }

    /**
     * We changed reference to refer some other location. 
     * So any changes made to reference are not reflected back in main
     */
    public static void change(Test t) {
        //
        t = new Test();
        t.x = 10;
    }

    /**
     * This does not change the reference, it only changes member 
     * of object referred by reference
     */
    public static void changeWithReflect(Test t) {
        t.x = 10;
    }
    
}

class Test {
    int x;
    Test(int i){ x = i; }
    Test() { x = 0; }
}
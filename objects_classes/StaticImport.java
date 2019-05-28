package objects_classes;

import static java.lang.System.out;

/**
 * Demonstrates an example of static import
 * @author Andres Ceballos Sanchez - andresrxn10@hotmail.com
 * @version 1.0
 * @since 2019/04/18
 */
public class StaticImport {

    public static void main(String[] args) {
        // We don't need to use 'System.out'  
        // as imported using static. 
        out.println("Testing static import!"); 
    }

}
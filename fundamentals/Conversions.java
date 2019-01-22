package fundamentals;

public class Conversions {
    /*Identity conversion: same type*/
    int firstValue = 20;
    int secondValue =  firstValue;
    
    String firstString = "Same type!";
    String secondString = firstString;

    /* Primitive conversions: widening and narrowing*/

    /*Widening conversion: occurs from a type to another type 
    whose size is the same or larger than that of the first type*/

    byte byteValue = 1;        
    short shortValue = byteValue; //byte to short    
    int intValue = shortValue; //byte, short to int    
    long longValue = intValue; //byte, short, int to long
    float floatValue = longValue; //byte, short, int, long to float
    double doubleValue = floatValue; //byte, short, int, long, float to double

    char charValue = 'a';
    int intCharValue = charValue; //char to int
    long longCharValue = charValue; //char to long
    float floatCharValue = charValue; //char to float
    double doubleCharValue = charValue; //char to double

    /**
     * Shows the widening primitive conversion, it occurs implicitily
     */
    public void showWideningConversion() {
        int smallerValue = 1;
        long largerValue = 2;
        
        largerValue = smallerValue; //Allowed
        smallerValue = largerValue; //Not Allowed
    }

    /* Narrowing conversions: occurs from a type to a different type
     that has a smaller size. Unlike the widening primitive conversion, 
     the narrowing primitive conversion must be explicit. You need to 
     specify the target type in parentheses.*/

     double doubleVar = 20d;
     float floatVar = (float) doubleVar; //double to float, long, int, char, short, byte
     long longVar = (long) floatVar; //float to long, int, char, short, byte
     int intVar = (int) longVar; //long to int, char, short, byte
     char charVar = (char) intVar; //int to char, short, byte
     short shortVar = (short) charVar; //char to short, byte
     char charVar2 = (char) shortVar; //short to char     
     byte byteVar = (byte) shortVar; //short to byte

     /**
      * Shows how the narrowing conversion may incur information loss,
       if the converted value is larger than the capacity of the target type
      */
     public static void showLossOfInformation() {
        long a = 9876543210L;
        int b = (int) a;
        System.out.println(b);
     }

     public static void main(String[] args) {
         showLossOfInformation();
     }
     




    
    
}
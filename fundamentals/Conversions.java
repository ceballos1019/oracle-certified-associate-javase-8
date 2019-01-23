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

     /*Boxing/Unboxing conversions: The ability to automatically convert 
     to/from a primitive to an object and back*/
     int myInt = 10;
     Integer myIntegerReference = myInt;
     int myOtherInt = myIntegerReference;
    
     /* String conversions: All the primitive types may be converted to String 
     through their Wrapper Classes, which override the toString() method*/   
     public static void showStringConversions() {
        Byte byteRef = 1;
        Short shortRef = 10;
        Integer intRef = 100;
        Long longRef = 1000L;
        Float floatRef = 10000f;
        Double doubleRef = 100000d;
        Character charRef = 'a';
        Boolean booleanRef = false;

         System.out.println("byte: " + byteRef.toString());
         System.out.println("short: " + shortRef.toString());
         System.out.println("int: " + intRef.toString());
         System.out.println("long: " + longRef.toString());
         System.out.println("float: " + floatRef.toString());
         System.out.println("double: " + doubleRef.toString());
         System.out.println("char: " + charRef.toString());
         System.out.println("boolean: " + booleanRef.toString());
     }

    /* Numeric promotions: To execute a binary operation, 
    it is necessary that both operands are compatible in terms of size*/
     
    //If one of the operands is a double, the other is promoted to double
    float errorWithFloat = 10d + 10f; //Error because result is a double
    double withDouble = 10d + 10f;

    //Otherwise, if one of the operands is a float, the other is promoted to float
    long errorWithLong = 3L + 4f; //Error because result is a float
    float withFloat =  3L + 4f;

    //Otherwise, if one of the operands is a long, the other is promoted to long
    int errorWithInt = 10 + 5L; //Error because result is a long
    long withLong = 10 + 5L;

    //Otherwise, both are considered int
    byte op1 = 4;
    byte op2 = 5;
    byte errorWithByte = op1 + op2; //Error because result is an int
    byte errorWithByte2 = (byte) op1 +  op2; //Only casting op1
    byte myByteResult = (byte) (op1 + op2);

     /**
      * We expect YOLO to be printed but the actual output is YO155
      When we use double quotes, the text is treated as a string and “YO” is printed
      but when we use single quotes, the characters ‘L’ and ‘O’ are converted to int
      */
    public static void showPromotionWithChar() {
        System.out.print("Y" + "O"); 
        System.out.print('L' + 'O');      
    }
     


     public static void main(String[] args) {
         showLossOfInformation();
         showStringConversions();
         showPromotionWithChar();
     }
     




    
    
}
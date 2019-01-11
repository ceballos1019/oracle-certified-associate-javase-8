package fundamentals;

/**
 * Shows the usage and features of primitive types
 * @author Andres Ceballos Sanchez - andresrxn10@hotmail.com
 * @version 1.0
 * @since 10/01/2019
 */
public class Primitives {

    /*Primitives types*/
    static byte byteVar;
    static short shortVar;
    static int intVar;
    static long longVar;
    static float floatVar;
    static double doubleVar;
    static char charVar;
    static boolean booleanVar;

    public static void main(String[] args) {
        /*Default values*/
        System.out.println("DEFAULT PRIMITIVE VALUES");
        System.out.println("========================");
        System.out.println("byte default value: " + byteVar);
        System.out.println("short default value: " + shortVar);
        System.out.println("int default value: " + intVar);
        System.out.println("long default value: " + longVar);
        System.out.println("float default value: " + floatVar);
        System.out.println("double default value: " + doubleVar);
        System.out.println("char default value: " + charVar);
        System.out.println("boolean default value: " + booleanVar);

        /* Range */
        System.out.println("\nPRIMITIVE RANGES");
        System.out.println("==================");
        System.out.println(String.format("byte ranges from %d to %d", Byte.MIN_VALUE, Byte.MAX_VALUE));
        System.out.println(String.format("short ranges from %d to %d", Short.MIN_VALUE, Short.MAX_VALUE));
        System.out.println(String.format("int ranges from %d to %d", Integer.MIN_VALUE, Integer.MAX_VALUE));
        System.out.println(String.format("long ranges from %d to %d", Long.MIN_VALUE, Long.MAX_VALUE));
        System.out.println(String.format("float ranges from %f to %f", Float.MIN_VALUE, Float.MAX_VALUE));
        System.out.println(String.format("double ranges from %f to %f", Double.MIN_VALUE, Double.MAX_VALUE));

        /* Overflow */
        int i = Integer.MAX_VALUE;
        int j = i + 1; //When an integer overflows, it rolls over to the minimum value and begins counting up from there.
        double d = Double.MAX_VALUE;
        double o = d + 1; //Floating point number overflow by returning Infinity        
        System.out.println("\nOVERFLOW");
        System.out.println("========");        
        System.out.println(j);
        System.out.println(o);  
        
        /* Autoboxing: conversion of a primitive type to its wrapper class
           Java can perform this conversion for us automatically */
        Character c = 'c';
        Integer i = 1;
    }    
}
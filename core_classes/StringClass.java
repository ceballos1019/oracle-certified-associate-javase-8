package core_classes;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/**
 * Class to Illustrate the String class
 * @author Andres Ceballos Sanchez - andresrxn10@hotmail.com
 * @version 1.0
 * @since 2019/07/30
 */
public class StringClass {

    public static void main(String[] args) {
        System.out.println("Testing!");
    }

    /**
     * Shows two ways to create a String in Java
     */
    public static void creatingString() {
        String literalString = "I'm a String!";
        String newString = new String("I'm a String!");
    }

    public static void showConstructors() throws UnsupportedEncodingException {
        /* Byte array */
        byte[] byteArray = {71, 101, 101, 107, 115};
        String stringFromByteArray = new String(byteArray); //Geeks

        /* Byte array using a specific charset */
        Charset charset = Charset.defaultCharset();
        String stringFromByteArrayWithCharset = new String(byteArray, charset); //Geeks

        /* Byte array using a charset name */
        String charsetName = "US-ASCII";
        String stringWithCharsetName = new String(byteArray, charsetName); //Geeks

        /* Byte array using an index */
        String stringFromByteArrayWithIndex = new String(byteArray, 1, 3); //eek

        /* Byte array using an index with charset */
        String stringFromByteArrayWithIndexAndCharset = new String(byteArray, 1, 3, charset); //eek
        String stringFromByteArrayWithIndexAndCharsetName = new String(byteArray, 1, 4, charsetName); //eeks


        /* Char array */
        char charArray[] = {'G', 'e', 'e', 'k', 's'};
        String stringFromCharArray = new String(charArray); //Geeks

        /* Char array specifying an index */
        String stringFromCharArrayWithIndex = new String(charArray, 1, 3); //eek

        /* Unicode Array */
        int[] unicodeArray = {71, 101, 101, 107, 115};
        String stringFromUnicodeArray = new String(unicodeArray, 1, 3); //eek
    }
}
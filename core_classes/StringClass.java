package core_classes;

import java.io.UnsupportedEncodingException;
import java.nio.channels.UnsupportedAddressTypeException;
import java.nio.charset.Charset;
import java.util.Locale;

/**
 * Class to Illustrate the String class
 * 
 * @author Andres Ceballos Sanchez - andresrxn10@hotmail.com
 * @version 1.0
 * @since 2019/07/30
 */
public class StringClass {

    public static void main(String[] args) {
        creatingString();
        try {
            showConstructors();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        showStringMethods();
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
        byte[] byteArray = { 71, 101, 101, 107, 115 };
        String stringFromByteArray = new String(byteArray); // Geeks

        /* Byte array using a specific charset */
        Charset charset = Charset.defaultCharset();
        String stringFromByteArrayWithCharset = new String(byteArray, charset); // Geeks

        /* Byte array using a charset name */
        String charsetName = "US-ASCII";
        String stringWithCharsetName = new String(byteArray, charsetName); // Geeks

        /* Byte array using an index */
        String stringFromByteArrayWithIndex = new String(byteArray, 1, 3); // eek

        /* Byte array using an index with charset */
        String stringFromByteArrayWithIndexAndCharset = new String(byteArray, 1, 3, charset); // eek
        String stringFromByteArrayWithIndexAndCharsetName = new String(byteArray, 1, 4, charsetName); // eeks

        /* Char array */
        char charArray[] = { 'G', 'e', 'e', 'k', 's' };
        String stringFromCharArray = new String(charArray); // Geeks

        /* Char array specifying an index */
        String stringFromCharArrayWithIndex = new String(charArray, 1, 3); // eek

        /* Unicode Array */
        int[] unicodeArray = { 71, 101, 101, 107, 115 };
        String stringFromUnicodeArray = new String(unicodeArray, 1, 3); // eek

        /* StringBuffer */
        StringBuffer stringBuffer = new StringBuffer("Geeks");
        String stringFromStringBuffer = new String(stringBuffer); // Geeks

        /* StringBuilder */
        StringBuilder stringBuilder = new StringBuilder("Geeks");
        String stringFromStringBuilder = new String(stringBuilder); // Geeks
    }

    /**
     * Shows the usage of different String methods
     */
    public static void showStringMethods() {
        String s = "GeeksforGeeks";
        // or String s= new String ("GeeksforGeeks");

        // Returns the number of characters in the String.
        System.out.println("String length = " + s.length());

        // Returns the character at ith index.
        System.out.println("Character at 3rd position = " + s.charAt(3));

        // Return the substring from the ith index character
        // to end of string
        System.out.println("Substring " + s.substring(3));

        // Returns the substring from i to j-1 index.
        System.out.println("Substring  = " + s.substring(2, 5));

        // Concatenates string2 to the end of string1.
        String s1 = "Geeks";
        String s2 = "forGeeks";
        System.out.println("Concatenated string  = " + s1.concat(s2));

        // Returns the index within the string
        // of the first occurrence of the specified string.
        String s4 = "Learn Share Learn";
        System.out.println("Index of Share " + s4.indexOf("Share"));

        // Returns the index within the string of the
        // first occurrence of the specified string,
        // starting at the specified index.
        System.out.println("Index of a  = " + s4.indexOf('a', 3));

        // Checking equality of Strings
        Boolean out = "Geeks".equals("geeks");
        System.out.println("Checking Equality  " + out);
        out = "Geeks".equals("Geeks");
        System.out.println("Checking Equality  " + out);

        out = "Geeks".equalsIgnoreCase("gEeks ");
        System.out.println("Checking Equality " + out);

        int out1 = s1.compareTo(s2);
        System.out.println("If s1 = s2 " + out);

        // Converting cases
        String word1 = "GeeKyMe";
        System.out.println("Changing to lower Case " + word1.toLowerCase());

        // Converting cases
        String word2 = "GeekyME";
        System.out.println("Changing to UPPER Case " + word1.toUpperCase());

        // Trimming the word
        String word4 = " Learn Share Learn ";
        System.out.println("Trim the word " + word4.trim());

        // Replacing characters
        String str1 = "feeksforfeeks";
        System.out.println("Original String " + str1);
        String str2 = "feeksforfeeks".replace('f', 'g');
        System.out.println("Replaced f with g -> " + str2);

        // codePointAt()
        System.out.print("Character (unicode point) at index 1 : " + s.codePointAt(1) + "  ");
        System.out.println(s.codePointAt(5));

        // codePointBefore()
        System.out.print("Character (unicode point) before index 1 : " + s.codePointBefore(1) + "  ");
        System.out.println(s.codePointBefore(7));

        // codePointCount()
        s = "G eek123 G**k";
        System.out.println("Character code point count : " + s.codePointCount(0, 5));

        s = "geeksforgeeks";

        // subSequence()
        // contains "for"
        CharSequence cs = s.subSequence(5, 8);

        // contains "geeks"
        CharSequence cs1 = s.subSequence(0, 5);

        String s_1 = "geekforgeek";

        // contains()
        System.out.println("Reult of contains on s_1 " + "with charSequence cs " + s_1.contains(cs));
        System.out.println("Reult of contains on s_1 " + "with charSequence cs1 " + s_1.contains(cs1));

        // contentEqual()

        System.out.print("Result of contentEqual ");
        System.out.println("geeks".contentEquals(cs1));

        System.out.print("Result of contentEqual ");
        System.out.println("geeksfor".contentEquals(cs1));

        s = "geeksforgeeks";

        // endsWith
        String ends_1 = "geeks";
        String ends_2 = "eks";
        String ends_3 = "for";

        System.out.println(s + "end with " + ends_1 + " " + s.endsWith(ends_1));
        System.out.println(s + "end with " + ends_2 + " " + s.endsWith(ends_2));
        System.out.println(s + "end with " + ends_3 + " " + s.endsWith(ends_3));

        // startWith
        String start_1 = "geeks";
        String start_2 = "for";

        System.out.println(s + " starts with " + start_1 + "  " + s.startsWith(start_1));
        System.out.println(s + " starts with " + start_2 + "  " + s.startsWith(start_2));

        s = "geeksforgeeks";

        // toCharArray
        char[] arr;
        arr = s.toCharArray();
        System.out.println("String toCharArray: ");
        for (char i : arr)
            System.out.print(i + " ");

        // getChars
        s.getChars(5, 8, arr, 0);
        System.out.println("\nSubString to existing " + "char array");
        for (char i : arr)
            System.out.print(i + " ");

        // hashCode
        s = "geeks";
        System.out.println("Hashcode of String s is " + s.hashCode());

        // intern()
        s_1 = "geeks";
        String s_2 = new String("geeks");
        String s_3 = s_2.intern();

        // returns true
        System.out.println(s_1 == s_2);

        // returns false
        System.out.println(s_1 == s_3);

        s = "geeksforgeeks";

        // format()
        s1 = String.format("%s : %d", s, 10);
        System.out.println(s1);

        s2 = String.format("%s = %f ", "Value of PI is", Math.PI);
        System.out.println(s2);

        // format() with locale
        // we are using the default locale here

        String s3 = String.format(Locale.getDefault(), "%s : %d", s, 10);
        System.out.println(s3);

        // isEmpty
        s4 = "";
        System.out.println("is String s empty " + s.isEmpty());

        System.out.println("is String s4 empty? " + s4.isEmpty());
    }
}
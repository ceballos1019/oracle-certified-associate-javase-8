package fundamentals;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
/**
 * Class to show how to either get or set the default character encoding in Java
 * @author Andres Ceballos Sánchez - andresrxn10@hotmail.com
 * @since 09/01/2019
 * @version 1.0
 */
public class CharacterEncoding {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {

        /*Getting the default character encoding*/

        /*The easiest way to get default character encoding in Java is to call
         System.getProperty("file.encoding"), which will return default character encoding 
         if JVM started with -Dfile.encoding property or program has not called
         System.setProperty("file.encoding, encoding).*/
        String defaultCharacterEncoding = System.getProperty("file.encoding");
        System.out.println("defaultCharacterEncoding by property: " + defaultCharacterEncoding);

        /*Charset.defaultCharset() returns default character encoding in Java.*/
        System.out.println("defaultCharacterEncoding by charSet: " + Charset.defaultCharset());

        /* Using InputStreamReader*/
        System.out.println("defaultCharacterEncoding by code: " + getDefaultCharEncoding());
        

        /* Setting the default character encoding */


        System.setProperty("file.encoding", "UTF-16");
      
        System.out.println("defaultCharacterEncoding by property after updating file.encoding : " + System.getProperty("file.encoding"));

        /* JVM caches value of default character encoding once JVM starts and so is the case
         for default constructors of InputStreamReader and other core Java classes. 
         So calling System.setProperty("file.encoding" , "UTF-16") may not have desire effect.*/
        System.out.println("defaultCharacterEncoding by code after updating file.encoding : " + getDefaultCharEncoding());
        System.out.println("defaultCharacterEncoding by java.nio.Charset after updating file.encoding : " + Charset.defaultCharset());
    }

    /**
     * This is kind of shortcut where you use default constructor of InputStreamReader 
     * and then later gets which character encoding it has used by calling reader.getEncoding().
     */
    public static String getDefaultCharEncoding(){
        byte [] bArray = {'w'};
        InputStream is = new ByteArrayInputStream(bArray);
        InputStreamReader reader = new InputStreamReader(is);
        String defaultCharacterEncoding = reader.getEncoding();
        return defaultCharacterEncoding;
    }
}

package fundamentals;

/**
 * Describes examples of literals
 * @author Andres Ceballos Sanchez - andresrxn10@hotmail.com
 * @since 2019/01/14
 * @version 1.0
 */
public class Literals {
    /**
     * Any constant value which can be assigned to the variable is called as literal
     * Literals of primitive types have four subtypes: integer literals, floating-point literals,
     * character literals and boolean literals.
     */
     int x = 100;
     char c = 'c';
    
    public static void main(String[] args) {
        //Integer literals may be written in decimal (base 10), hexadecimal (base 16), octal (base 8) or binary     
        int decimalLiteral = 101; 
        int octalLiteral = 0146; //The octal number should be prefix with 0.
        int hexaLiteral = 0X123Face; //The hexa-decimal number should be prefix with 0X or 0x.
        int binaryLiteral = 0b1111; //Binary literal should be prefixed with 0b or 0B.
        System.out.println(decimalLiteral);
        System.out.println(octalLiteral);
        System.out.println(hexaLiteral);
        System.out.println(binaryLiteral);

        //Float point literals
        float floatLiteral = 120.023e-23F;
        float floatLiteral2 = .232e33f;
        float floatLiteral3 = 897e-23F;
        double doubleLiteral = 2324.598e73; //No need to put D
        double doubleLiteral2 = .23e43D;
        double doubleLiteral3 = 434e-23d;

        //Boolean literals: Only two values are allowed for Boolean literals i.e. true and false.
        boolean trueLiteral = true;
        boolean falseLiteral = false;

        //Character literals: characters o escape sequence

        //characters
        char a = 'a';
        char b = 'Z';     
        char ch = 062;
        char ch2 = '\u0061';// Here /u0061 represent a.
        System.out.println(ch);
        System.out.println(ch2);

        //escape sequences
        char backspace = '\b';
        char tab = '\t';
        char backslash = '\\';
        char singleQuote = '\'';
        char doubleQuoute = '\"';
        char linefeed = '\n';
        char carriageReturn = '\r';
    }
}
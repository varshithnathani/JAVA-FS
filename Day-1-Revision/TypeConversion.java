import java.sql.SQLOutput;

public class TypeConversion {
    public static void main(String[] args) {

        short s = 10;
        int num1 = s; // Direct Conversion
        System.out.println(num1);

        short s2 = (short) num1; // Type Casting
        System.out.println(s2);


    }
}

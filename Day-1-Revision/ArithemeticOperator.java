public class ArithemeticOperator {
    public static void main(String[] args) {
        int num1 = 10;

        // addition;
        num1 += 20;
        System.out.println(num1);

        // subtraction
        num1 -= 2;
        System.out.println(num1);

        // modulo --> for getting the remainder
        int num2 = 2;
        num1 %= num2;
        System.out.println(num1);

        // multiplication;

        int num3 = 3;
        num1 *= num3;
        System.out.println(num1);

        // division
        int num4 = 4;
        num4 /= num3; // value will be 1.33 --> but it takes as 1.[round off]
        System.out.println(num4);

        // post - increment;
        num4++;
        System.out.println(num4);

        // post -decrement;
        num4--;
        System.out.println(num4);

        // pre - increment
        ++num4;
        System.out.println(num4);

        // pre - decrement;
        --num4;
        System.out.println(num4);
    }
}

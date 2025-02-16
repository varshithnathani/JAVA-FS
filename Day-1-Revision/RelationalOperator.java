public class RelationalOperator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // num1 is less than num2 -->  " < "
        boolean result1 = num1<num2;
        System.out.println(result1);

        // num1 is greater than num2 -->  " > "
        boolean result2 = num1>num2;
        System.out.println(result2);

        // num3 is greater than or equals to num4;
        int num3 = 10;
        int num4 = 10;
        boolean result3 = num3>=num4;
        System.out.println(result3);

        // num3 is less than or equals to num4;
        boolean result4 = num3<=num4;
        System.out.println(result4);

        // num3 is equals to num4
        boolean result5 = num3==num4;
        System.out.println(result5);

        // num3 is not equals to num4
        boolean result6 = num3!=num4;
        System.out.println(result6);

        // num3 is not greater than num4
        boolean result7 = !(num3 > num4);  // num3 is equal to num4 --> in this case it is not grater so the answer should return true;
        System.out.println(result7);

        // num3 is not less than num4
        boolean result8 = !(num3 < num4);
        System.out.println(result8);

        // num3 is not equals to num4 --> false.
        boolean result9 = !(num3 == num4);
        System.out.println(result9);


    }
}

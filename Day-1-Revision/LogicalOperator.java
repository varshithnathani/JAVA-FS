public class LogicalOperator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int num3 = 40;
        int num4 = 30;

        // && --> AND Operator
        boolean result1 = num1 > num2 && num3 > num4;
        System.out.println(result1);

        // || --> OR Operator
        boolean result2 = num1>num2 || num3>num4;
        System.out.println(result2);

        // ! --> Not Operator
        boolean result3 = num1<num2;
        System.out.println(result3);

        System.out.println(!result3);
    }
}

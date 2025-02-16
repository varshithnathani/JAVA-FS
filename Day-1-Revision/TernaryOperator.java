public class TernaryOperator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int result;
        // Normal if-else
        if(num1>num2){
            result = 10;
        }else{
            result = 20;
        }
        System.out.println(result);


        // Ternary Operator
        // condition ? "if condition is true" : "If condition is false";
        int result2 = num1>num2 ? 10 : 20;
        System.out.println(result2);

    }
}

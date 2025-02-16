public class IfElseIf {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int num3 = 20;

        // Highest value using if - else if
        if(num1>num2 && num1>num3){
            System.out.println(num1);
        }else if(num2>num1 && num2>num3){
            System.out.println(num2);
        }else{
            System.out.println(num3);
        }
    }
}

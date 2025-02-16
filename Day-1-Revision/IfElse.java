public class IfElse {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // if condition only check whether the given is true or not
        // so, even if directly mention true in if condition then it will execute
        if(true){
            System.out.println("It is from true --> If condition");
        }else{
            System.out.println("It is else condition --> If condition");
        }

        // practical example
        if(num1 > num2){
            System.out.println("num1 is greater than num2");
        }else{
            System.out.println("num2 is greater than num1");
        }

        // using AND Operator in if condition
        if(num1 < num2 && num2 > 10){
            System.out.println("num1 is less than num2 && num2 > 10");
        }else{
            System.out.println("num2 is less than num1 or num2 > 10");
        }
    }
}

@FunctionalInterface
interface A{
    void show();
}

public class LambdaExpressions {

    public static void main(String[] args) {
        // Lambda Expression --> Compiler will add the remainig sysntax. 
        A obj = () -> System.out.println("in Show --> Main using LB");

        obj.show();

    }
    
}

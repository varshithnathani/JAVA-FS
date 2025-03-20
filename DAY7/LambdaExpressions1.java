@FunctionalInterface
interface A{
    void show( int i);
}

public class LambdaExpressions1 {

    public static void main(String[] args) {
        // Lambda Expression --> Compiler will add the remainig sysntax. + with parameters.
        
        //A obj = (i) -> System.out.println("in Show --> Main using LB"); //  (or)
        A obj = i -> System.out.println("in Show --> Main using LB");


        obj.show(10);

    }
    
}

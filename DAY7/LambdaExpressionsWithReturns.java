@FunctionalInterface
interface Amego{
    int add(int i, int j);
}

public class LambdaExpressionsWithReturns {
    public static void main(String[] args) {

        // Normal Obj

        // Amego obj = new Amego(){
        //     @Override
        //     public int add(int i, int j){
        //         return i+j;
        //     }
        // };

        // int result = obj.add(10, 20);
        // System.out.println(result);


        // Using Lambda Expression

        Amego obj = (i, j) -> i+j;

        int result = obj.add(10, 20);
        System.out.println(result);
    }
    
}



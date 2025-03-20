@FunctionalInterface
interface A{
    void show();
}

public class FunctionalInterface1{
    public static void main(String[] args){

        // creating anonymous class
        A obj = new A(){
            public void show(){
                System.out.println("in Show --> Main");
            }
        };

        obj.show();
    }
}
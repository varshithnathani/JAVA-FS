package DAY3;

class A{
    public A(){
        System.out.println("A's Constructor");
    }

    public void display(){
        System.out.println("A's display");
    }
}
public class AnonymousObject {
    public static void main(String[] args) {
        // Anonymous Object --> once created cannot be used again
        new A().display();
        new A().display();
    }
}

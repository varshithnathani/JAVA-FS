package DAY4;

class A{
    public void display(){
        System.out.println("Display A");
    }
}
class B extends A{
    public void display(){
        System.out.println("Display B");
    }
}

class C extends A{
    public void display(){
        System.out.println("Display C");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {

        A a = new A();
        a.display();


        a = new B(); // reference is from super class and object is from class B.
        a.display();

        a = new C();
        a.display();
    }
}

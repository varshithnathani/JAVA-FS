package DAY6;

// Annotations are class type and method type.f
class A{
    public void display(){
        System.out.println("A");
    }
}

class B extends A{
    // By mentioning @Override here --> if we call the B method then it will call B.Display() only,
    // it won't call the super class
    @Override
    public void display(){
        System.out.println("B");
    }
}
public class Annotations {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}

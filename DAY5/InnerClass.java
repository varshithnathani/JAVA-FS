package DAY5;

class A{

    int age;

    public void display(){
        System.out.println("A's age is " + age);
    }


    //class B{
    static class B{

        public void config(){
            System.out.println("in config");
        }

    }
}

public class InnerClass {
    public static void main(String[] args) {

        A a = new A();
        a.display();

        // B b = new B(); we will get error bcz B is inside the class.--> so it belongs to A class.
        // A.B b = a.new B();  --> if class B is non static, then B class need the object of A class
        // if the class B is a static then no need of object A.
        A.B b = new A.B();
        b.config();
    }
}

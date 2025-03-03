package DAY5;

class Alpha{
    public void display(){
        System.out.println("Alpha");
    }
}


public class AnonymousInnerClass {
    public static void main(String[] args) {

        Alpha obj = new Alpha()
        {
            public void display(){
                System.out.println("new Alpha");
            }
        };

        obj.display();
    }
}

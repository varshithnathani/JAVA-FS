package DAY3;

class DemoA {
    public void display() {
        System.out.println("in DemoA --> Display");
    }
    public void config(){
        System.out.println("in DemoA --> config");
    }
}

class DemoB extends DemoA {
    // Overriding.
    public void display() {
        System.out.println("in DemoB --> Display");
    }
}
public class MethodOverRiding {
    public static void main(String[] args) {

        DemoB b1 = new DemoB();
        b1.display();
        b1.config();
    }
}

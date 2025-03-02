package DAY4;

class Alpha{
    public void display1(){
        System.out.println("Alpha");
    }
}

class Beta extends Alpha{
    public void display2(){
        System.out.println("Beta");
    }
}
public class UpcastingAndDowncasting {
    public static void main(String[] args) {


        Alpha alpha = new Alpha();
        alpha.display1();

        // alpha = (Alpha) new Beta(); // Upcasting (or)
        alpha = new Beta();
        alpha.display1();

        Beta beta = new Beta();
        beta.display2();

        Beta beta2 = (Beta) alpha;  // Downcasting
        beta2.display2();



    }
}

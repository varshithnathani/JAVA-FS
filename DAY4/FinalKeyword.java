package DAY4;

// final --> variable, Method, class


// if someone want to inherit the properties of this class then we can use the final infront of class
// final class prevents froms inheriting


//final class Calc{
class Calc{

    // if i don't want to access the method by other class/ Overriding my method in diff class
    // then i have to use the final in-front of the method name.

//    public final void display(){
    public  void display(){
        System.out.println("Display Calc");
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
}

class AdvCalc extends Calc{
    public void display(){
        System.out.println("Display AdvCalc");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        // final --> variable
        final int num = 10;
        // num = 100;
        System.out.println(num);


        // final --> C
        Calc calc = new Calc();
        calc.display();
        calc.add(1,2);


    }
}

package DAY5;

// interface is used to show the design.
// multiple interface is accepted.

// class -> interface --> implements
// interface -> interface --> extends
// class -> class --> extends


interface Amego{
    public abstract void config();
    void display(); // by default public + abstract in interface.

//    int age;  // final and static  by default in interface.
//    String name;  // so we have to initalize the values then we won't get the error
    int age = 20;
    String name = "varshith";
}

interface x{
    void run();
}

interface y extends x{

}

class C implements Amego, x{
    public void config(){
        System.out.println("in config");
    }
    public void display(){
        System.out.println("in Display");
    }

    public void run(){
        System.out.println("in run");
    }
}


public class InterfaceBasic {
    public static void main(String[] args) {

        Amego a;
        // a = new Amego(); --> we will get an error, we can't instantiate it.

        a = new C();
        a.config();
        a.display();

        System.out.println(Amego.age);
        System.out.println(Amego.name);

        // if i try to use a.run() i will get error bcz it is in  interface x
        // to call the run() we need to create a new obj
        x obj = new C();
        obj.run();
    }
}

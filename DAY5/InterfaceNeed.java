package DAY5;


//class Computer{
//    public void code(){
//
//    }
//}

//abstract class Computer{
//    public abstract void code();
//}

interface Computer{
    void code();
}




class Laptop implements Computer{
    public void code(){
        System.out.println("Code, Compile, run");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Desktop, Compile, run, Faster..");
    }
}
class Devloper{
    public void devApp(Computer lap){
        lap.code();
    }
}
public class InterfaceNeed {
    public static void main(String[] args) {

//        Laptop lap = new Laptop();
//        Desktop desktop = new Desktop();

        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Devloper obj = new Devloper();
        obj.devApp(desk);

    }
}

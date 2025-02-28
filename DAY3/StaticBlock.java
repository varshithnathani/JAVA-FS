package DAY3;

class Device{
    String brand;
    int price;
    static String name;


    // static block is only executed once
    // it executes before the constructor
    static{
        name = "Phone";
        System.out.println("in static block");
    }
    public Device(){
        brand = "";
        price = 1000;
        System.out.println("in constructor");
    }

    public void display(){
        System.out.println(brand+" "+price+" "+name);
    }

}

public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {

//        Device d = new Device();
//        Device d2 = new Device();

        // if we don't want to create a obj then we can use "Class.forName();"
        // it helps to load the class --> but it won't call any constructors.
        Class.forName("DAY3.Device");

    }
}

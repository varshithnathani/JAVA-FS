package DAY3;

class SmartPhone {
    String brand;
    int price;
    static String name;

    public void display() {
        System.out.println(brand + " " + price + " " + name);
    }

    // inside a static method static variables can be accessible but non-static variables are not allowed
    // to solve that we can access the object.
    public static void display2(SmartPhone s1) {
        System.out.println(s1.brand + " " + s1.price + " " + name);
    }

}
public class StaticMethod {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone();
        s1.brand = "Samsung Galaxy";
        s1.price = 50;
        s1.name = "S24 Ultra";

        s1.display2(s1);
    }
}

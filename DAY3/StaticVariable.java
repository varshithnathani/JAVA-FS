package DAY3;

class Mobile{
    String brand;
    int price;
    static String name;

    public void display(){
        System.out.println(brand+" "+price+" "+name);
    }

}

public class StaticVariable {
    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        m1.brand = "iphone";
        m1.price = 50;
        m1.name = "16Pro";
        m1.display();

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 50;
        m2.name = "S25 Ultra";
        m2.display();

        // name is static variable so even in this case we changed m1.name it effect name.
        // Same can be accesable by any object.
        m1.name = "Hello";
        m2.display();
    }
}

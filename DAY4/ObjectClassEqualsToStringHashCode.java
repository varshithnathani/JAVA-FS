package DAY4;

import java.util.Objects;

class Laptop{
    String model;
    int price;


    //Override
    public String toString(){
        return model+" "+price;
    }


    // In this case we are using only some test case, for better use ide help
//    public boolean equals(Laptop that){
//        if(this.model.equals(that.model)  && this.price == that.price){
//            return true;
//        }else{
//            return false;
//        }
//    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }
}

public class ObjectClassEqualsToStringHashCode {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.model= "HP Pavilion";
        l.price= 55000;

        System.out.println(l);
        // by default obj calls the .toString() method  --> if we override then also it will call the .toString()
        // it will get response from the class Laptop.
        System.out.println(l.toString());
        // .toString is default method available in jdk.
        // we can override the .toString() method as we like.


        Laptop l2 = new Laptop();
        l2.model= "HP Pavilion";
        l2.price= 55000;

        boolean result = l==l2; // in this case we will get false.
        System.out.println(result);
        boolean equals = l.equals(l2); // in this also we will get false;
        System.out.println(equals);

        // so we can override the equals method. to get the perfect answer.
    }
}

package DAY3;


class Human{

    // instance variables
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}

public class EncapsulationOOPs {
    public static void main(String[] args) {

        Human h = new Human();
        h.setAge(20);
        h.setName("varshith");

        System.out.println(h.getAge());
        System.out.println(h.getName());
    }
}

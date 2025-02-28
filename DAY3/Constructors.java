package DAY3;

class DemoConstructor{
    private int age;
    private String name;


    // Default constructor
    public DemoConstructor(){
        age = 20;
        name = "varshith";
    }

    // parameterized constructor.
    public DemoConstructor(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

}

public class Constructors {
    // constructor is same as class name
    // no need to mention any types
    // Ex: public Constructors(){}
    // even though we don't call the constructor explicitly but whenever we create a new obj it will call the constructor.
    public static void main(String[] args) {
        DemoConstructor demo = new DemoConstructor();
        DemoConstructor demo2 = new DemoConstructor();

        System.out.println(demo.getAge()+" "+demo.getName());

        DemoConstructor demo3 = new DemoConstructor(2004,"Varshith Nathani");
        System.out.println(demo3.getAge()+" "+demo3.getName());

    }


}

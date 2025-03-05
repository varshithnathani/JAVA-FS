package DAY6;

enum Laptop{
    Mac(2000), XPS(2000), Pavilion(1000), Thinkpad(2000);

    private int value;

    private Laptop(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

public class EnumClass {
    public static void main(String[] args) {
        Laptop lap = Laptop.Mac;
        System.out.println(lap+" "+lap.getValue());

        for(Laptop l: Laptop.values()){
            System.out.println(l+" "+l.getValue());
        }
    }
}

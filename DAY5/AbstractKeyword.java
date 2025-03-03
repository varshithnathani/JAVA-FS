package DAY5;

// abstract method can have only in abstract class only
// but abstract class no need of abstract method.
abstract class Car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("Play music");
    }
}

class Tayota extends Car{  // concrete class.
    public void drive(){
        System.out.println("Tayota drive");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {

        // we won't be able to create the obj of abstract class.
        // but we can create the reference of the class.
        Car car = new Tayota();
        car.drive();
        car.playMusic();
    }
}

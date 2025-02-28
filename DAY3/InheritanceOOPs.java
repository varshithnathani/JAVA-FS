package DAY3;

class Calc{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
}

// inheriting the calc all properties to AdvCalc.
// parent and child class.
// "is" relationship need to be there for inheritance.
// Ex: MG is a car

// in this AbvCalc we are able to remove the Redundancy. (by not writing the add and sub methods again)
class AdvCalc extends Calc{
    public int multi(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
}


// Multi - Level inheritance

class VeryAdvCalc extends AdvCalc{
    public int pow(int a,int b){
        return (int)Math.pow(a,b);
    }
}
public class InheritanceOOPs {
    public static void main(String[] args) {

        VeryAdvCalc cal = new VeryAdvCalc();
        System.out.println(cal.add(1,2));
        System.out.println(cal.sub(2,3));
        System.out.println(cal.div(2,3));
        System.out.println(cal.pow(2,3));

    }
}

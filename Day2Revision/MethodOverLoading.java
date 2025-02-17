package Day2Revision;

// Method OverLoading --> Same method with different parameters in same class
class Calculation {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
}
public class MethodOverLoading {
    public static void main(String[] args) {
        Calculation calc = new Calculation();
        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(10, 20, 30));
        System.out.println(calc.add(10.1, 20.0));
    }
}

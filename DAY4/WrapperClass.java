package DAY4;

public class WrapperClass {
    public static void main(String[] args) {
        int num = 7;
        Integer num2 = new Integer(num); // boxing
        Integer num3 = num; // auto-boxing
        System.out.println(num2);
        System.out.println(num3);

        int num4= num2.intValue();
        System.out.println(num4);


        String str = "100";
        int number = Integer.parseInt(str);
        System.out.println(number*10);
    }
}

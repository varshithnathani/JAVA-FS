public class ForLoop {
    public static void main(String[] args) {
        for(int i =1; i<=5; i++){
            System.out.println("Hi "+i);
        }

        // for loop inside for loop
        // try to make a time wise calendar for a week from morning 9:00 AM to 6:00PM with 1hr duration
        for(int i =1; i<=7; i++){
            System.out.println("Day - "+ i);

            for(int j =1; j<=9; j++){
                System.out.println("  "+(j+8)+" - "+(j+9));
            }
        }
    }
}

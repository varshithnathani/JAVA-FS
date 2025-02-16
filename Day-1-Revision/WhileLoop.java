public class WhileLoop {
    public static void main(String[] args) {
        int n = 1;
        while(n < 6){
            System.out.println("Hi "+ n);
            n++;
        }
        System.out.println("Bye");
        System.out.println();

        // while inside while
        n =1;
        while(n<3){
            System.out.println("Hi "+ n);
            int j = 1;
            while(j<4){
                System.out.println("Hello "+ j);
                j++;
            }
            n++;
        }
    }
}

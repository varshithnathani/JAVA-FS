public class ExceptionHandling {
    public static void main(String[] args) {
        
        int i =0;
        int j = 0;

        try{
            j = 99/i;
        }catch(Exception e){
            System.out.println("Something is wrong");
        }

        System.out.println(j+" Bye.. ");

    }
    
}

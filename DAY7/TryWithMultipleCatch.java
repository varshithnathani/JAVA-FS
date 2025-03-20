public class TryWithMultipleCatch {

    public static void main(String[] args) {
        
        int i =2;
        int j =0;

        int[] nums = new int[5];
        try{

            j = 10/i;
            System.out.println(nums[1]);
            System.out.println(nums[5]); // java is 0-based index --> so we get an exception here.

        }
        // catch(Exception e){
        //     System.out.println("Some error  --> "+e);
        // }

        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your arr limit");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(j+"  Bye..");
    }
    
}

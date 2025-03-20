import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamEx {
    public static void main(String[] args) {
        
                // For parallel stream we need a large data set.

        List<Integer> nums = new ArrayList<>(10_000);
        
        // Random helps to create the data randomly with some upper bound.
        Random ran = new Random();
        for(int i =0; i<10_000; i++){
            nums.add(ran.nextInt(100));
        }

        // System.out.println(nums);

        // int sum1 = nums.stream()
        //     .map(i -> i*2)
        //     .reduce(0, (c,e) -> c+e);

        // System.out.println(sum1);

        long startSeq = System.currentTimeMillis();
        int sum2 = nums.stream()
            .map(i -> i*2)
            .mapToInt(i -> i)
            .sum();
        long endSeq = System.currentTimeMillis();
        System.out.println("Time taken for sequential stream: "+(endSeq-startSeq));

        //System.out.println(sum2);


        long startPar = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
            .map(i -> i*2)
            .mapToInt(i -> i)
            .sum();
        long endPar = System.currentTimeMillis();
        System.out.println("Time taken for parallel stream: "+(endPar-startPar));

        System.out.println(sum2+" "+ sum3);
        
    }
    
}

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        
        // stream is an interface
        
        List<Integer> values = Arrays.asList(1,2,3,4,5);

        // Stream<Integer> s1 = values.stream();
        // // if we use the stream we cannot reuse the stream again.
        // // by using steeam we can perform any operation on the data without causing any change in the original data.
        // //s1.forEach(val -> System.out.println(val));
        // // s1.forEach(val -> System.out.println(val));  --> this will give an error.
        
        // Stream<Integer> s2 = s1.filter(n -> n%2==0); // just printing the even numbers.
        // //s2.forEach(val -> System.out.println(val));

        // Stream<Integer> s3 = s2.map(n -> n*n); // squaring the even numbers.
        // // s3.forEach(val -> System.out.println(val));
        // int result = s3.reduce(0, (c, e) -> c+e); // adding the squared even numbers.
        // System.out.println(result);

        int result = values.stream()
            .filter(n -> n%2==0)
            .map(n -> n*n)
            .reduce(0, (c, e) -> c+e);
        
        System.out.println(result);
    }


    
}

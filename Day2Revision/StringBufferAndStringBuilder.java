package Day2Revision;

public class StringBufferAndStringBuilder {
    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer();
//
//        // By default string buffer gives 16byte
//        System.out.println(sb.capacity());
//

        StringBuffer sb = new StringBuffer("Varshith");
        sb.append(" Nathani");
        System.out.println(sb);

        // deleting a char from the sb
        sb.deleteCharAt(3);
        System.out.println(sb);


        sb.insert(8,"Java ");
        System.out.println(sb);

        // String builder is not safe due to asynchronous nature, and it is not a thread safe class.
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Nathani");
        System.out.println(sb1);

    }
}

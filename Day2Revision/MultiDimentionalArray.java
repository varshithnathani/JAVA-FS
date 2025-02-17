package Day2Revision;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        int[][] num = new int[3][3];

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();


        int[][] arr = new int[3][3];
        for(int i =0; i<arr.length; i++) {
            for(int j =0; j<arr[i].length; j++) {
                arr[i][j] =(int) (Math.random()*100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i =0; i<arr.length; i++) {
            for(int j =0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for(int n[]: arr){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}

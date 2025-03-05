package DAY6;


enum Status{
    Running, Failed, Paused, Stopped;  // Named Constants
}

public class EnumKeyword {
    public static void main(String[] args) {
        int i =5;
        Status s = Status.Running;
        System.out.println(s);
        Status s1 = Status.Failed;
        System.out.println(s1);

        System.out.println(s1.ordinal());

        Status[] ss = Status.values();
        for(Status sss: ss){
            System.out.println(sss);
        }
    }
}

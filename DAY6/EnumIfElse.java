package DAY6;

enum Statuss{
    Running, Failed, Pending, Success;
}

public class EnumIfElse {
    public static void main(String[] args) {

        Statuss ss = Statuss.Pending;

        System.out.println(ss.getClass().getSuperclass());

        switch(ss){
            case Running:
                System.out.println("Running");
                break;
            case Failed:
                System.out.println("Failed");
                break;
            case Pending:
                System.out.println("Pending");
                break;
            default:
                System.out.println("Done");
                break;

        }



        if(ss == Statuss.Running){
            System.out.println("Running");
        }else if(ss == Statuss.Failed){
            System.out.println("Failed");
        }else if(ss == Statuss.Pending){
            System.out.println("Pending");
        }else{
            System.out.println("Done");
        }
    }
}

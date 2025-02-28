package DAY3;
class Alpha{
    public Alpha(){
        super();
        System.out.println("in Alpha");
    }
    public Alpha(int a){
        System.out.println("in Alpha int - a");
    }
}


class Beta extends Alpha{
    public Beta(){  // here it will check the super() and calls the constructor of the super class.
        super();
        // by default there will be super();
        // if we want to mention super() explicitly we need to mention it just after the constructor creation.

        System.out.println("in Beta");
    }
    public Beta(int a){
        // we called this constructor from the main method.
        // here we have super() so it will call the super class default constructor.
        super();
        System.out.println("in Beta int - a");
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        Beta b = new Beta(5); // it will call the constructor of Beta which has the parameter of int
        Beta b1 = new Beta(); // in this case it will call the default constructor from beta
        // and beta will call the super class default constructor. i.e; alpha.
    }
}



/*
* What if i want to access the --> in A int --> in B
*
*   public Beta(){
*         super(5); // here we mention parameterized in super method. which will call the parameterized constructor in super class.
*         System.out.println("in B);
*   }  */



/*      what if i want -->  in A  --> in B --> in B int     */

/*      we have "this" to call the same class constructor,*/

/*  public B(int n){
        this();  // here we used this() --> which will call the same class constructor. i.e; public beta(){}
                 // public Beta(){} will call the super class default constructor.
        System.out.println("in B --> int);
    }
 */


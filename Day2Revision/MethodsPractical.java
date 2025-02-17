package Day2Revision;

class Shop{
    public void playMusic(){
        System.out.println("Playing Music");
    }

    public String getMeAPen(int n){
        if(n >=10){
            return "Here is ur pen";
        }else{
            return "Nope";
        }
    }
}

public class MethodsPractical {
    public static void main(String[] args) {

        Shop shop = new Shop();
        shop.playMusic();
        System.out.println(shop.getMeAPen(3));
    }
}

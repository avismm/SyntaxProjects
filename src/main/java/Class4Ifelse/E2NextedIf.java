package Class4Ifelse;

public class E2NextedIf {
    public static void main(String[] args) {
        boolean winter=true;
        String jacketColor="blue";
        if (winter==true) {
            System.out.println("It is very cold");
            if(jacketColor.equals("Red")){
                System.out.println("Lets do with red nike shoes");
        }else{
                System.out.println("Lets fo with the blue ones");
            }
        }else {
            System.out.println("No need to ware jackets");
        }
    }
}

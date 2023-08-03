package Class4;

public class E3NextedIf {
    public static void main(String[] args) {
        double accountBalannce=15000;
        if(accountBalannce>20000){
            System.out.println("We can afford a normal toyota car");
            if(accountBalannce>50000){
                System.out.println("We can also afford luxury as well");
            }
        }else {
            System.out.println("We need to save more");
        }

    }
}

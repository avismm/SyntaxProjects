package Class8;

public class BreakKeyWord {
    public static void main(String[] args) {
        //break keyword will break out of the loop
        for (int i = 0; i < 10; i++) {
            if(i==6){
                break;
            }
            System.out.println("My value is "+i);

        }
    }
}

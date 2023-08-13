package Class8;

public class ContinueKeyword {
    public static void main(String[] args) {
        //Continue keyword will skip the iteration once the condition
        //within the scope becomes true
        for (int i = 0; i < 10; i++) {
            if(i==6){
                continue;// Skip
            }
            System.out.println("My value is "+i);

        }
    }
}

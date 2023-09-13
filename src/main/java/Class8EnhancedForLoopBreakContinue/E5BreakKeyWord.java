package Class8EnhancedForLoopBreakContinue;

public class E5BreakKeyWord {
    public static void main(String[] args) {
        /*break keyword only terminates the loop where it was
         inserted if the condition becomes true*/
        for (int i = 0; i < 10; i++) {
            System.out.println("Outer loop");
            for (int j = 0; j < 5; j++) {
              if(j==2){
                  break;
              }
                System.out.println("Inner loop");
            }

        }
    }
}

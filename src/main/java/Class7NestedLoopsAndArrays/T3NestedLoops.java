package Class7NestedLoopsAndArrays;

public class T3NestedLoops {
    public static void main(String[] args) {

        int y=1;
        int x=1;
        while(y<=4){
                          while(x<=6){
                    if(x!=3) {
                        System.out.print(" " + x);

                    }
                    x++;
            }
            System.out.println();
            y++;
        }
    }
}

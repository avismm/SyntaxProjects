package Class7;

public class E9NestedLoops {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 6; j++) {
                if(i==2 && j==3) {
                    System.out.print(" ");
                }else if (i==3&&j==3){
                    System.out.print(" ");
                }else{
                        System.out.print("#");
                    }
            }
            System.out.println();
                   }
    }
}

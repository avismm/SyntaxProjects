package ReviewClass3;

public class E5NestedLoopPrintATriangle {
    public static void main(String[] args) {
        for(int i=1;i<10;i++) {
            System.out.println();
            if(i<=5) {
                for (int j = 0; j < i; j++) {
                    System.out.print("#");
                }
            }else if(i>5) {
                for (int k = i; k < 10; k++) {
                    System.out.print("#");
                }
            }

        }

    }
}

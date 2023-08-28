package Class12OOP;

public class PerformanceStringBufferStringBuilder {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        StringBuilder stb =new StringBuilder("Tree");
        for (int i = 0; i < 100000; i++) {
            stb.append("fruit");

        }
        System.out.println("Time taken by String buider = "+(System.currentTimeMillis()-startTime));


        startTime = System.currentTimeMillis();
        StringBuffer sb =new StringBuffer("Tree");
        for (int i = 0; i < 100000; i++) {
            sb.append("fruit");


        }
        System.out.println("Time taken by String buider = "+(System.currentTimeMillis()-startTime));
    }

}

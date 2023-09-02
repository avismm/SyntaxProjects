package Class11OOP;

public class E3StringMethods {
    public static void main(String[] args) {
        String str="Batch 17 is great.";
        int aCount=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a')
                aCount++;
        }
        System.out.println(aCount);
    }


}

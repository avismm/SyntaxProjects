package PracticeQuestions;

public class ArraysAndLoopsE2 {
    public static void main(String[] args) {
        // This is an infinite loop
        int z = 0;
        for (int y = 0; y >= z; y++) {
            System.out.print(y + "~");
            System.out.println(z);
        }
    }
}

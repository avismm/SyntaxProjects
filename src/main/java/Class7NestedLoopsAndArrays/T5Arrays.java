package Class7NestedLoopsAndArrays;

public class T5Arrays {
    public static void main(String[] args) {
        int [] numbers={20,29,48,69,60};

         for(int i = 0; i < numbers.length; i++) {
             if(numbers[i]%2==0) {
                 System.out.print(" " + numbers[i]);
             }
        }
    }
}

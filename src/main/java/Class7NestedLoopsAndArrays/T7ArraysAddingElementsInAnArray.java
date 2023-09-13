package Class7NestedLoopsAndArrays;

public class T7ArraysAddingElementsInAnArray {
    public static void main(String[] args) {
        int [] numbers={20,29,48,69,60};
int sum=0;
         for(int i = 0; i < numbers.length; i++) {
sum=sum+numbers[i];
         }
        System.out.println(sum);
    }
}

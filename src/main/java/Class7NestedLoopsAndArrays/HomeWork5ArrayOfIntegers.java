package Class7NestedLoopsAndArrays;
/*Create an array on integers and calculate the sum of
  all elements in an array*/
public class HomeWork5ArrayOfIntegers {
    public static void main(String[] args) {
        int [] numbers={1,3,4,5,6,7,8};
        int num=0;
        for (int i = 0; i<numbers.length; i++) {
            num=num+numbers[i];
        }
        System.out.print(num);
    }
}

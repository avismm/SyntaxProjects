package Class7;

public class Task6ArrayMaxNumber {
    public static void main(String[] args) {
        int [] numbers={1,3,10,5,6,7,8};
        int max=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
                if(numbers[i]>max){
                max=numbers[i];
        }
        }
        System.out.print(max);
    }
}

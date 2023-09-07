package PracticeQuestions;

public class replit141PrintMaxValueInArray {

    static int maxValue(int[] arr){
        int maxNum=arr[0];

        //iterating through the array numbers
        for(int c:arr){

            //Update the largest number if the current value is larger than previous
            if(c>maxNum){
                maxNum=c;
            }

        }
        return maxNum;
    }
    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};
        System.out.println(maxValue(arr)); //should print 22
    }

}



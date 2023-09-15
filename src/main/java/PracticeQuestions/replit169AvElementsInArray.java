package PracticeQuestions;

public class replit169AvElementsInArray {

    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(new replit169AvElementsInArray().avgElements(a)); //should print 4.8
    }

    final static double avgElements(int[] arr){
        double sum =0;
        double average;
        for(int i=0; i<= arr.length-1;i++){
            sum+=arr[i];
        }
        average=sum/(arr.length);
        return average;
    }
}

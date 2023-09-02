package PracticeQuestions;

public class replit117 {
    public static void main(String[] args){
        replit117 obj=new replit117();
        obj.sumEvenToX(5);
    }


    //calculate the sum of the EVEN integers from 1 to x (including x)
    void sumEvenToX(int x){
        int sum=0;
        for (int i = 1; i <=x; i++) {
            if(i%2==0){
                sum+=i;
            }

        }
        System.out.println("sumEvenToX"+"("+x+")"+"="+sum);

    }

}



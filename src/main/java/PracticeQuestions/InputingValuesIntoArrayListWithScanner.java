package PracticeQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class InputingValuesIntoArrayListWithScanner {

        public static void main(String[] args) {
            ArrayList<Integer> arr=new ArrayList<>();
            Scanner input =new Scanner(System.in);

            for(int i=0;i<5;i++){
                int value=input.nextInt();
                arr.add(value);
            }
            for(int num:arr){
                System.out.print(num+" ");
            }

        }
    }


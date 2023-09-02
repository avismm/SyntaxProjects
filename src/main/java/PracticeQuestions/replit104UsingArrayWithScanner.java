package PracticeQuestions;

import java.util.Scanner;

public class replit104UsingArrayWithScanner {
    public static void main(String[] args) {
        /*Create an array of names that will hold 5 String elements.

Names must be taking from a user.

Print out the first three characters of each element of the array, one per line.

Note: every array element must be at least 3 characters long. */
      
        Scanner input=new Scanner(System.in);
        String [] names= new String[5];
        for (int i = 0; i < names.length; i++) {
            do {
                System.out.println("Please enter element " + i + " of the array (array element must be at least 3 characters long)");
                names[i] = input.nextLine();
            }while(!(names[i].length()>=3));
        }
       for(String n:names){
           System.out.println(n.substring(0,3));
       }
    


    }
}

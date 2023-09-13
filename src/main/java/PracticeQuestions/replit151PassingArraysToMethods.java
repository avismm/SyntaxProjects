package PracticeQuestions;

public class replit151PassingArraysToMethods {
        public static void main(String[] args) {

            //defining the array of integers
            int[][] a = {

                    { 1, 2, 3 },

                    { 4, 5, 6 },

                    { 7, 8, 9 }

            };
            //calling the method and passing the array as parameter
            sum2D(a);
        }

        public static void sum2D (int[][] a){
            int sum=0;

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    sum+=a[i][j];
                }

            }
            System.out.println(sum);
        }

    }



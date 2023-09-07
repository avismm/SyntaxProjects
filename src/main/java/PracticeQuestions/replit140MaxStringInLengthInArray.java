package PracticeQuestions;

public class replit140MaxStringInLengthInArray {

    static String maxLength(String[] array){
        String maxString="";
        int maxStringLength=0;

        //iterating through the strings
        for(String C:array){
            int currentStringLength=C.length();

            //Update maxLength and maxLenString if the current string is longer
            if(currentStringLength>maxStringLength){
                maxStringLength=currentStringLength ;
                maxString=C;
            }
        }
        return maxString;
    }
    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }


}



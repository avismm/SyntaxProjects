package Class23;

import java.util.ArrayList;

public class E6ArrayLists {
    public static void main(String[] args) {

        //Arrays can store anything
        ArrayList arr=new ArrayList();
        String str="Mehab";
        arr.add(str);
        arr.add("Avis");
        arr.add(34);
       checkPrint(arr);
    }
    static void checkPrint(ArrayList a){

        //We must use the Object variable for Java because arrays can store anything. But this will cause a run time error as
        //it may not be possible to convert other data elements.
        for(Object d:a){
            String str=(String)d;
            System.out.println(str.length());

        }
    }
}

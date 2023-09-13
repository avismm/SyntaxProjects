package Class8EnhancedForLoopBreakContinue;

import java.util.ArrayList;
/*This is a resizable(dynamic array). It grows in size to accommodate new
elements and shrinks the size when elements are removed.*/

public class ForEachLoopArrayList {
    /*A for-each loop (also called the enhanced for loop) is a traversing
    technique to iterate through the elements in an array/collection(Array List)
    it takes lesser steps in coding and is more readable,
    but it is less flexible*/
    public static void main(String[] args) {
        ArrayList<String> animals=new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("pet");
        animals.add("sheep");
        animals.add("donkey");
        animals.add("lion");
        animals.add("deer");
for(String i:animals){ // This is read as: For every String i in an array of animals.
    System.out.println(i);
}
    }
}

package Class8;

public class ForEachLoopOrEnhancedForLoop {
    //This loop is a traversing technique to iterate through the
    //elements in an array/collection(array list)
    //it takes lesser steps in coding and is more readable,
    // but it is less flexible
    public static void main(String[] args) {
String[] animals= new String[5];
animals[0]="dog";
animals[1]="cat";
animals[2]="sheep";
animals[3]="rat";
animals[4]="cow";
for(String i :animals){// read as: For every String in an array of animals.
    System.out.println(i);
}
    }
}

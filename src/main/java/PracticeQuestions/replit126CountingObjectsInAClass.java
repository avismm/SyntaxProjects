package PracticeQuestions;

public class replit126CountingObjectsInAClass {

    private static int count = 0; // Static variable to count objects

    public replit126CountingObjectsInAClass(){
        count++;
    }
    public static int fetchCount() {
        return count; // Getter method to retrieve the object count
    }

    public static void main(String[] args){
        replit126CountingObjectsInAClass obj1=new replit126CountingObjectsInAClass();
        replit126CountingObjectsInAClass obj2=new replit126CountingObjectsInAClass();
        replit126CountingObjectsInAClass obj3=new replit126CountingObjectsInAClass();


        // Get and print the object count
        int objCount = replit126CountingObjectsInAClass.fetchCount();
        System.out.println(objCount);

    }

}

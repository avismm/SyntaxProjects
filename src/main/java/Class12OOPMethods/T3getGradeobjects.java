package Class12OOPMethods;

public class T3getGradeobjects {

    public static void main(String[] args) {

      /*creating an object using the new keyword:
        When we create an instance of a class using the new keyword, it allocates
        memory (heap) for the newly created object and also returns the reference
        of that object to that memory*/
        T3getGrade obj=new T3getGrade();

        //Invoking method using the object
       obj.getGrade(23);

    }

}

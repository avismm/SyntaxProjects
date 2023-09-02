package Class15Constructors;

public class Task2ConstructorTesterApproach2 {
    //calling the constructors under class Task1Students
    public static void main(String[] args) {

        /*Instantiating the class and calling the method in one line.
        This is only recommended when you want to call only one method from the class*/

        new TaskStudents("Avis", 45.4, 45.8, 43.9).calcAverage();
      new TaskStudents("Alex", 68.7, 90.8, 66).calcAverage();

    }
}

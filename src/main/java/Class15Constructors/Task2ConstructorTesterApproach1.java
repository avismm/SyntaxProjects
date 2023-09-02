package Class15Constructors;

public class Task2ConstructorTesterApproach1 {
    //calling the constructors under class Task1Students
    public static void main(String[] args) {
      TaskStudents s1=new TaskStudents("Avis", 45.4, 45.8, 43.9);
     s1.calcAverage();


      TaskStudents s2=new TaskStudents("Alex", 68.7, 90.8, 66);
      s2.calcAverage();
    }
}

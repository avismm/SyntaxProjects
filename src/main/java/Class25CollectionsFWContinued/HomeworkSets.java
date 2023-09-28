package Class25CollectionsFWContinued;

/*Create a Set that will hold Objects of Student Type.
        In this set we do not care about the insertion order. Each student object should have name and studentID.
        Display name of each student.*/

import java.util.HashSet;

public class HomeworkSets {
    public static void main(String[] args) {

        //Creating a HashSet called students and adding three Student objects into it.
        HashSet<Student> students=new HashSet<>();
        students.add(new Student("Avis","34EER4566"));
        students.add(new Student("Alex","34EER0996"));
        students.add(new Student("Tina","NHS9956565"));
        students.add(new Student("Godfrey","NJU78834E"));

        //Using the forEach method to iterate over the students HashSet
        // and print the studentName of each student using a lambda expression.
        students.forEach(x->x.printInfo());
    }
}
class Student{
   private String studentName;
    private String studentID;

    //Constructor for initializing the Student instance variables
    public Student(String studentName, String studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    //method to print the student name
    void printInfo(){
        System.out.println(studentName);
    }
}

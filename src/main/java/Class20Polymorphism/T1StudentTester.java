package Class20Polymorphism;

//You can replace Ctrl + r to replace text within the code
public class T1StudentTester {
    public static void main(String[] args) throws InterruptedException {
        T1Student[] arr={new CollegeStudent(), new SchoolStudent(),new T1Student()};

        /*We can use the enhanced for loop and declare a variable s that stores objects from an array of T1Student,
        and then call the method from the objects' classes*/
        for(T1Student s:arr){
           s.takeClasses();
        }
    }
}

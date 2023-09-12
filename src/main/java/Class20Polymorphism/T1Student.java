package Class20Polymorphism;

public class T1Student {

    void takeClasses(){
        System.out.println("Teaching students");
    }

}
class CollegeStudent extends T1Student{
    void takeClasses(){
        System.out.println("Learning science classes");
    }
}
class SchoolStudent extends T1Student{
    void takeClasses(){
        System.out.println("Learning all classes");
    }

}

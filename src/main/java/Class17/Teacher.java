package Class17;

public class Teacher {
    String name;
    int age;

    void teaching(){
        System.out.println("Teaching on weekdays");
    }

    void coaching(){
        System.out.println("Coaching on weekends");
    }
    void lecturing(){
        System.out.println("Lecturing on holidays");
    }
}
class MathTeacher extends Teacher {

}
class ChemistryTeacher extends Teacher {

}
class PianoTeacher extends Teacher {

}

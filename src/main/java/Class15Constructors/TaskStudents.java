package Class15Constructors;

public class TaskStudents {
    String name;
    double mark1;
    double mark2;
    double mark3;
    public TaskStudents(String cName, double cMark1, double cMark2, double cMark3){
mark1=cMark1;
mark2=cMark2;
mark3=cMark3;
name=cName;
    }
    void calcAverage(){
        double average = (mark1+mark2+mark3)/3;
        System.out.println(name+"'s average mark is "+average);
    }
}

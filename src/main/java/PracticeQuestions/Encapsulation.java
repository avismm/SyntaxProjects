package PracticeQuestions;

public class Encapsulation {

    public static void main(String[] args){

        //creating an object of the EncapsulationDemo class via the default non parameterized constructor
        EncapsulationRepl179 obj=new EncapsulationRepl179();
        obj.setName("Mario");
        obj.setAge(32);
        System.out.println("Employee Name: "+obj.getName());
        System.out.println("Employee Age: "+obj.getAge());

    }

}
class EncapsulationRepl179{
    private String empName;
    private int empAge;

    public String getName(){
        return empName;

    }

    public void setName(String empName){
        this.empName=empName;

    }

    public int getAge(){
        return empAge;

    }

    public void setAge(int empAge){
        this.empAge=empAge;

    }

}
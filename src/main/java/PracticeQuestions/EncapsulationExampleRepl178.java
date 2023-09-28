package PracticeQuestions;

public class EncapsulationExampleRepl178 {

    public static void main(String[] args){

        //creating an object of the EncapsulationDemo class via the defaul constructor
        EncapsulationDemo obj=new EncapsulationDemo();
        obj.setName("John");
        obj.setAge(30);
        System.out.println("Employee Name: "+obj.getName());
        System.out.println("Employee Age: "+obj.getAge());

    }
}

class EncapsulationDemo{
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

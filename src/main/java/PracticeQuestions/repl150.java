package PracticeQuestions;

public class repl150 {
    String firstName;
    String lastName;
    int age;

    public repl150(String firstName, String lastName, int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    void printInfo(){
        System.out.println(firstName+" "+lastName+" "+age);
    }
    public static void main(String[] args){
        repl150[] arr={new Employee("Joe", "Smith",35, 35000),new Tester1("Adam", "Smith",15, 0,"java")};
        for(repl150 p:arr){
            p.printInfo();

        }
    }


}

class Employee extends repl150 {
    int salary;
    public Employee(String firstName, String lastName, int age,int salary){
        super(firstName, lastName, age);
    }
    void printInfo(){
        System.out.println(firstName+" "+lastName+" "+age+" "+salary);
    }

}
class Tester1 extends Employee{
    String programmingLanguages;
    public Tester1(String firstName, String lastName, int age,int salary,String programmingLanguages){
        super(firstName, lastName, age,salary);
    }
    void printInfo(){
        System.out.println(firstName+" "+lastName+" "+age+" "+programmingLanguages);
    }

}




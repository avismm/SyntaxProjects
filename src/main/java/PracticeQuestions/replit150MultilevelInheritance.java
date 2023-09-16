package PracticeQuestions;

public class replit150MultilevelInheritance {

    public static void main(String[] args){

        /*Creating an array of Person objects containing instances of both Employee and Tester classes
        and then looping through the array to call the printInfo method for each object.*/

        Person[] arr={new EmployeePerson("Joe", "Smith",35, 35000),new TesterEmployee("Adam", "Smith",15, 0,"java")};
        for(Person p:arr){
            p.printInfo();

        }
    }

}
class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;

    }
    void printInfo(){
    }

}

class EmployeePerson extends Person {

    //declaring the instance variable salary in the Employee subclass
    int salary;

    /* Declaring a constructor that initializes both the Employee properties (salary)
    and the properties inherited from Person (firstName, lastName,age)*/
    public EmployeePerson(String firstName, String lastName, int age,int salary){
        super(firstName, lastName, age);
        this.salary=salary;
    }

    /*The printInfo method in this subclass overrides the printInfo method
    defined in the parent Person*/ 
    public void printInfo(){
       System.out.println(firstName+" "+lastName+" "+age+" "+salary);
    }

}
class TesterEmployee extends EmployeePerson{

    //declaring the instance variable programmingLanguages in the tester subclass
    String programmingLanguages;

    /* Declaring a constructor that initializes both the Tester properties (programmingLanguages) and
    the properties inherited from Employee (firstName, lastName,age)*/
    public TesterEmployee(String firstName, String lastName, int age,int salary,String programmingLanguages){

        // calling the Employee's class's method from the Tester child class using the super keyword.
        super(firstName, lastName, age,salary);
        this.programmingLanguages=programmingLanguages;
    }

    /*The printInfo method in this subclass overrides the printInfo method defined in the parent Employee and grandparent Person*/

    public void printInfo(){
       System.out.println(firstName+" "+lastName+" "+age+" "+programmingLanguages);
    }

}

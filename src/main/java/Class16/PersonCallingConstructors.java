package Class16;

public class PersonCallingConstructors {
    private String name;
   private int age;
 private   double weight;
    private char gender;
    private String hairColor;
    private double salary;

    //declaring the constructor with local variables
    public PersonCallingConstructors(String name, int age, double weight, char gender, String hairColor, double salary){

        //Assigning the values from the local variables to the instance variables

        //We can call another constructor inside another one.
        //Note: When calling a constructor inside another one, the call must be on the first line as shown below.
        this(name, age, weight, gender);
       this.hairColor=hairColor;
       this.salary=salary;
    }

    public PersonCallingConstructors(String name, int age, double weight, char gender){

        //Assigning the values from the local variables to the instance variables
        this.name =name;
        this.age=age;
        this.weight=weight;
        this.gender=gender;
    }
    public void printInfo(){
        System.out.println(name+", "+age+", "+weight+", "+gender+", "+hairColor+", "+salary);
    }
}

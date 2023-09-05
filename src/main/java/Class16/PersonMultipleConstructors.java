package Class16;

public class PersonMultipleConstructors {
    private String name;
   private int age;
 private   double weight;
    private char gender;
    private String hairColor;
    private double salary;

    //declaring the constructor with local variables
    public PersonMultipleConstructors(String pName, int pAge, double pWeight, char pGender, String pHairColor, double pSalary){

        //Assigning the values from the local variables to the instance variables
        name =pName;
       age=pAge;
       weight=pWeight;
       gender=pGender;
       hairColor=pHairColor;
       salary=pSalary;
    }

    public PersonMultipleConstructors(String pName, int pAge, double pWeight, char pGender){

        //Assigning the values from the local variables to the instance variables
        name =pName;
        age=pAge;
        weight=pWeight;
        gender=pGender;
    }
    public void printInfo(){
        System.out.println(name+", "+age+", "+weight+", "+gender+", "+hairColor+", "+salary);
    }
}

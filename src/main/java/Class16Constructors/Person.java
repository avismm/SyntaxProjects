package Class16Constructors;

public class Person {
    private String name;
   private int age;
 private   double weight;
    private char gender;

    //declaring the constructor with local variables
    public Person(String pName, int pAge, double pWeight, char pGender){

        //Assigning the values from the local variables to the instance variables
        name =pName;
       age=pAge;
       weight=pWeight;
       gender=pGender;
    }
    public void printInfo(){
        System.out.println(name+", "+age+", "+weight+", "+gender);
    }
}

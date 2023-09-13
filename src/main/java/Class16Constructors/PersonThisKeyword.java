package Class16Constructors;

public class PersonThisKeyword {
    private String name;
   private int age;
 private   double weight;
    private char gender;

    //declaring the constructor with local variables
    public PersonThisKeyword(String name, int age, double weight, char gender){

        //Assigning the values from the local variables to the instance variables using "this" keyword.
        this.name =name;
       this.age=age;
       this.weight=weight;
       this.gender=gender;
    }
    public void printInfo(){
        // Java will prefer the local variable unless the keyword "this" is used.
        String name="GUI";
        System.out.println(name+", "+age+", "+weight+", "+gender);
    }
}

package Class16Constructors;

public class TaskCat {
    private String name;
   private int age;
 private   double weight;
    private char gender;
    private String skinColor;
    private String eyeColor;

    //declaring the constructor with local variables
    public TaskCat(String name, int age, double weight, char gender, String skinColor, String eyeColor){

        //Assigning the values from the local variables to the instance variables
        //Calling another constructor inside another one.
        //Note: When calling a constructor inside another one, the call must be on the first line as shown below.
        this(name, age, weight, gender);
       this.skinColor=skinColor;
       this.eyeColor=eyeColor;
    }

    public TaskCat(String name, int age, double weight, char gender){

        //Assigning the values from the local variables to the instance variables
        this.name =name;
        this.age=age;
        this.weight=weight;
        this.gender=gender;
    }
    public void printInfo(){
        System.out.println(name+", "+age+", "+weight+", "+gender+", "+skinColor+", "+eyeColor);
    }
}

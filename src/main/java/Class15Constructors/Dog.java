package Class15Constructors;

public class Dog {
    private String name;
   private String breed;
   private String color;
    private int age;

    //Declaration of the Constructor
   public Dog (String dName, String dBreed, String dColor, int dAge){
        name =dName;
        breed=dBreed;
        color=dColor;
        age=dAge;

    }

    public void bark(){
        System.out.println("nuff nuff nuff......");
    }
    public void printInfor(){
        System.out.println(name+" "+breed+" "+age);
    }

}

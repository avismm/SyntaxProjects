package Class19MethodOverloadingOverridingAndSuperKeyword;

public class AnimalOverriding {
private String name;
private String color;
private int age;
int num=20;
double weight=12.6;

    public AnimalOverriding(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public void printInfor(){
        System.out.println(name +" "+color+" "+age);
    }
}
class Dog extends AnimalOverriding {
    //int num=5;
    public Dog(String name, String color, int age, double weight) {
        super(name, color, age);
       // this.weight=weight;
    }

    //This method which also exists in the parent class, will be overridden in the parent class
    public void printInfor(){

        //Calling the printInfor method from the parent class and adding one more variable in the Dog class
        super.printInfor();
        System.out.println(weight);
        System.out.println("My own method");
    }
}

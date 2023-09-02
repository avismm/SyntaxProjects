package Class10OOP;public class Replit88 {
    //properties/attributes
    String breed;
    String name;
    String color;

    //methods/functions/behaviours
    void bark(){
        System.out.println("can bark");
    }
    void run(){
        System.out.println("can run");
    }
    void play(){
        System.out.println("can play");
    }

    public static void main(String[] args) {
        /*Here, we will create actual dog instances/objects by using the Main class and assigning values or attributes to the object lunasObj.*/

        //Declaring the bulldog object
        Replit88 husky=new Replit88();
        husky.breed="german";
        husky.name= "Husky";
        husky.color= "black";

        //Here we are calling the methods (bark,run and play) on husky
        System.out.print(husky.name+" ");
        husky.bark();
        System.out.print(husky.name+" ");
        husky.run();
        System.out.print(husky.name+" ");
        husky.play();

        //Declaring the bulldog object
        Replit88 bulldog=new Replit88();
        bulldog.breed="german";
        bulldog.name= "Bulldog";
        bulldog.color= "black";

        //Here we are calling the methods (bark,run and play) on bulldog
        System.out.print(bulldog.name+" ");
        bulldog.bark();
        System.out.print(bulldog.name+" ");
        bulldog.run();
        System.out.print(bulldog.name+" ");
        bulldog.play();


        //Declaring the Labrador object
        Replit88 labrador=new Replit88();
        labrador.breed="german";
        labrador.name= "Labrador";
        labrador.color= "black";

        //Here we are calling the methods (bark,run and play) on labrador
        System.out.print(labrador.name+" ");
        labrador.bark();
        System.out.print(labrador.name+" ");
        labrador.run();
        System.out.print(labrador.name+" ");
        labrador.play();

    }
}

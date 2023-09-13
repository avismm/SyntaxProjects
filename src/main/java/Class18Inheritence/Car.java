package Class18Inheritence;

public class Car {
   private String make;
 private   String model;
   private String color;
   private double price;
    public Car(String make, String model, String color, double price){
      this.make=make;
      this.model=model;
      this.price=price;
      this.color=color;
    }

    public Car(String make, String model, String color){
        this.make=make;
        this.model=model;
        this.price=price;
    }
    void printInfo(){
        System.out.println(make+" "+model+" "+color);
    }
}
class BMW extends Car{
public BMW(String make, String model, String color, double price){

    /*calling the constructor from the parent class
    to initialize the instance fields of the parent class*/
    super(make, model, color, price);
}
}
class Audi extends Car{
    boolean sunRoof;
    public Audi(String make, String model, String color, double price,boolean sunRoof) {
        super(make, model, color, price);//must match at least one constructor from the parent class
        this.sunRoof=sunRoof;
    }

}

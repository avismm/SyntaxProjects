package Class15Constructors;

public class CarUsingConstructor {
    private String make;
    private String model;
    private String color;
    private double price;

    /*declaring the constructor. Constructors do not have a return type and must have the
     same name as the class
     */
    public CarUsingConstructor(String cMake, String cModel, String cColor, double cPrice) {
      /*
       We initialize the instance variables with the values
       the user will be passing through the constructor parameters*/
        make = cMake;
        model = cModel;
        color = cColor;
        price = cPrice;
    }

        public void printInfo() {
            System.out.println(make + " " + model + " " + price + " " + color);
        }
        void setPrice(double cPrice){
            price=cPrice;
            System.out.println(price);

        }
        double getPrice(){
        return price;
        }


}
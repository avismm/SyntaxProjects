package Class10OOP;

public class main {
    String carColor;
    int year;
    String carMake;

    public static void main(String[] args) {

        main car1=new main();

        car1.carMake="BMW";
        car1.carColor="Black";
        car1.year=2019;

        System.out.println("Car color is " +car1.carColor + "and car year is " +car1.year+ "and car model is "+car1.carMake);

        main car2=new main();

        car2.carMake="Toyota";
        car2.carColor="White";
        car2.year=2018;

        System.out.println("Car color is " +car2.carColor + "and car year is " +car2.year+ "and car model is "+car2.carMake);

    }
}

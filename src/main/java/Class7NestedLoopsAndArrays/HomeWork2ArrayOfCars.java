package Class7NestedLoopsAndArrays;
/*Create an array of cars and store 6 elements into it.
  Using 2 different loops print all values from the array.*/
public class HomeWork2ArrayOfCars {
    public static void main(String[] args) {
        String [] cars={"BMW","Toyota", "Nissan","Benz","Tesla","Range Rover"};
        for (int i = 0; i<cars.length; i++) {
            System.out.print(" "+cars[i]+",");

        }
    }
}

package Class7;
/*Create an array of cars and store 6 elements into it.
  Using 2 different loops print all values from the array.*/
public class HomeWork1ArrayOfCars {
    public static void main(String[] args) {
        String [] cars={"BMW","Toyota", "Nissan","Benz","Tesla","Range Rover"};
        int i=0;
        while (i<cars.length) {
            System.out.print(" "+cars[i]+",");
i++;
        }
    }
}

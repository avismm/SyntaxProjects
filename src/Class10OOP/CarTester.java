package Class10OOP;

public class CarTester {
    public static void main(String[] args) {

        //Creating the BMW object
        car bmwObj=new car();

        bmwObj.name="BMW";
        bmwObj.model= "BMW2";
        bmwObj.type= "station wagon";
        bmwObj.year=2007;


        // printing of the BMW attributes
        System.out.println(bmwObj.name);
        System.out.println(bmwObj.model);
        System.out.println(bmwObj.type);
        System.out.println(bmwObj.year);

        //Here we are calling the methods (calls,camera, messages)
        bmwObj.highPerformance();
        bmwObj.movement();
        bmwObj.applyBreaks();

        System.out.println();

        //Creating the toyota object
        car toyotalObj=new car();

        toyotalObj.name="Toyota";
        toyotalObj.model= "Vitz 6";
        toyotalObj.type= "salon";
        toyotalObj.year=2023;

        // printing of the toyota attributes
        System.out.println( toyotalObj.name);
        System.out.println( toyotalObj.model);
        System.out.println( toyotalObj.type);
        System.out.println( toyotalObj.year);

        //Here we are calling the methods (calls,camera, messages)
         toyotalObj.highPerformance();
         toyotalObj.movement();
         toyotalObj.applyBreaks();
        System.out.println();

        //Creating the ford object
        car fordObj=new car();

        fordObj.name="Ford";
        fordObj.model= "XX";
        fordObj.type= "Station wagon";
        fordObj.year=2011;

        // printing of the ford attributes
        System.out.println(fordObj.name);
        System.out.println(fordObj.model);
        System.out.println(fordObj.type);
        System.out.println(fordObj.year);

        //Here we are calling the methods (calls,camera, messages)
        fordObj.highPerformance();
        fordObj.movement();
        fordObj.applyBreaks();


    }
}

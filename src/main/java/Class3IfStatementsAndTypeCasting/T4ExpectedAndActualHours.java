package Class3IfStatementsAndTypeCasting;

/*Create a Java program that stores the expected temperature and the
  actual temperature for a day. If the expected temperature is higher
  than the actual temperature, print "It's cooler than expected, wear a jacket!",
  otherwise print "It's as warm as expected, enjoy your day!"*/
public class T4ExpectedAndActualHours {
    public static void main(String[] args) {
       double expectedTemperature=98;
       double actuaTemperature=67;
       if(expectedTemperature>actuaTemperature){
           System.out.println("It's cooler than expected, wear a jacket");
       }
       else{
           System.out.println("It's as warm as expected, enjoy your day!");
       }
    }
}

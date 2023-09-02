package Class12OOP;

/*Create a method that will say Hello in different language
based on the country that will passed when method is executed*/

public class T5PrintingHelloBasedOnCountryLanguage {

    void SayHello (String country){
        switch (country) {
            case "Uganda":
                System.out.println("Agandi");
                break;
            case "Vietnam":
                System.out.println("Chau em!");
                break;
            case "Italy":
                System.out.println("Ciao!");
                break;
            case "France":
                System.out.println("Bonjour!");
                break;
            case "Spain":
                System.out.println("Hola!");
                break;
            default:
                System.out.println("Hello!");
        }
    }
}


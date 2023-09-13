package Class4Ifelse;

public class T2NextedIfsMortgage {
    public static void main(String[] args) {

        double mortgageRate =1.2;
        double motgagePrice=34000;
        if(mortgageRate>4.5){
            System.out.println("You cannot buy a house");
        }else {
            System.out.println("You can buy a house");
            if(motgagePrice>50000){
                System.out.println("You can take a loan");
            }else{
                System.out.println("You can pay cash");
            }
        }

    }
}

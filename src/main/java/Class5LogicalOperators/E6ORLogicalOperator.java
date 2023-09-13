package Class5LogicalOperators;

// using a method that ignores the case of the word
public class E6ORLogicalOperator {
     public static void main(String[] args) {
       /* boolean broughtFlowers=false;
        boolean broughtChocolate=false;
        boolean allMyMistake=true;
        if(broughtChocolate||broughtFlowers||allMyMistake){
        System.out.println("My wife is happy");
    }else{
            System.out.println("My wife is sad");
        }*/

        String genere="thriller";
        if(genere.equalsIgnoreCase("thriller")||genere.equalsIgnoreCase("horror")||genere.equalsIgnoreCase("sci fiction")){
            System.out.println("I am going to the movie theatre");
        }else{
            System.out.println("I will not go to the theatre");
        }

    }
}

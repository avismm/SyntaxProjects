package ReviewClass6;

public class OOPReviewBook {
    String name;
    String author;
    int year;
    double price=6000;

    void read(){
        System.out.println("I am reading the bool "+name+" by "+author);
    }
    void changePrice(double newPrice){
        System.out.println("The price of the book "+name+" has changed from "+price+" to "+newPrice );
    }
double totalPrice(double tax){
        double total=tax*price;
        return total;
    }

    public static void main(String[] args) {

        //is creating a new instance of the Book class, invoking its constructor and calling the read method.
        new OOPReviewBook().read();
        System.out.println(new OOPReviewBook().totalPrice(0.45));
        new OOPReviewBook().changePrice(7000);
    }

}

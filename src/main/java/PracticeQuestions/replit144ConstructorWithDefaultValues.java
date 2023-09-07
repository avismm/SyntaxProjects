package PracticeQuestions;

public class replit144ConstructorWithDefaultValues {
    private String label;

    private double price;

    private String category;

    private boolean hasExpiration;

    private int stock;

    public replit144ConstructorWithDefaultValues (String label, double price, String category, Boolean hasExpiration, int stock){
        this.label=label;
        this.price=price;
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;
    }

    public replit144ConstructorWithDefaultValues (String label, double price, int stock){
        this.label=label;
        this.price=price;
        this.stock=stock;
        category="misc";
        hasExpiration=true;
    }
    public replit144ConstructorWithDefaultValues (String label, double price){
        this.label=label;
        this.price=price;
        stock=0;

    }

    void display(){
        System.out.println(label+" "+price+" "+ category+" "+ hasExpiration+" "+stock);
    }

    public static void main(String [] args){
        new replit144ConstructorWithDefaultValues("Eggs", 3, "Produce", true, 10).display();
        new replit144ConstructorWithDefaultValues("paper towels", 2, 4).display();
        new replit144ConstructorWithDefaultValues("paper towels",2).display();
    }
}



package PracticeQuestions;

public class CalculatingTotalValueOfStockItems {
    private String item;
    private double price;
    private int quantity;

    public CalculatingTotalValueOfStockItems(String item, double price, int quantity){
        this.item=item;
        this.price=price;
        this.quantity=quantity;

    }

    double itemTotalPrice(){
        System.out.println(item+" "+" Total Value "+(price*quantity));
        return price*quantity;
    }

    // Calculate the total value of all stock items
    public static double OverallStockValue(CalculatingTotalValueOfStockItems[] items) {
        double totalValue=0.0;
        for (CalculatingTotalValueOfStockItems item : items) {
            totalValue += item.itemTotalPrice();
        }
        return totalValue;
    }


    public static void main(String[] args){
       new CalculatingTotalValueOfStockItems("Blanket",99.98,1);
        new CalculatingTotalValueOfStockItems("Mattress",439.18,1);


        // Creating an array of Main objects
        CalculatingTotalValueOfStockItems[] items = new CalculatingTotalValueOfStockItems[]{
                new CalculatingTotalValueOfStockItems("Blanket", 99.98,1),
                new CalculatingTotalValueOfStockItems("Matress", 439.18,1)
        };
        // Calculate the total value of all items
        double totalValue = OverallStockValue(items);

        // Print the total value
        System.out.println("You purchased "+ totalValue+" Today");

    }
}



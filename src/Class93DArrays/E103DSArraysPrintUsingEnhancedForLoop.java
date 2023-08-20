package Class93DArrays;

public class E103DSArraysPrintUsingEnhancedForLoop {
    public static void main(String[] args) {

        String[][] cars={
                {"BMW","BENZ","AUDI"},
                {"Tesla","Ford","Ford"},
                {"john","peter","Amon"},
                {"Italian","Italian","Italian"}};
        for(String[] OneDimension : cars) {// This is read as: "for every string in array of cars"
            for(String element:OneDimension)// This is read as: "For every string in an array of OneDimension
                System.out.print(element+ " ");
        }
      //  System.out.println();
        //System.out.println(Arrays.deepToString(cars));// for printing 2D arrays
    }
    }

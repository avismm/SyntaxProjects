package Class18InheritenceAndSuperKeyword;
class grandPa{
    String color="White";
}
public class Furniture extends grandPa {
    String color="Black";

}
class chair extends Furniture {
   String color="Brown";
    void printColor(){
       String color="Blue";
        System.out.println(color);//this will print the value of the local variable inside the method printColor
        System.out.println(super.color);//this will print the value of color from the nearest parent class
        System.out.println(this.color);//this will print the value of color from the instance variable of the class chair
    }

}
class furnitureTester{
    public static void main(String[] args) {
        chair chair=new chair();
        chair.printColor();
    }


}
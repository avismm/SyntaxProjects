package Class10ObjectOrientedProgramming;

public class E3StringDemo {
    public static void main(String[] args) {

        String name = "MADINA"; // String obj2=new String("Dog)
       if(name.length()<8){
           System.out.println("Name not allowed");
       }
        System.out.println(name.toLowerCase());
        System.out.println(name); // Here, the contents of the variable are not affected
        name=name.toLowerCase();// Here, the contents of the variable are reassigned.
    }
}
package ReviewClass8;

public class Overriding {
    void speak(){
        System.out.println("Animals speak");
    }
    void sleep(){
        System.out.println("Animals sleep");
    }

}
class Dog extends Overriding{
    @Override //This annotation performs some extra validations/checks
    void speak() {
        System.out.println("buff buff");
    }
}

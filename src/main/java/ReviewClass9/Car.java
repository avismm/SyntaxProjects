package ReviewClass9;

public class Car implements Washable{
    public void  drive(){
        System.out.println("driving............");
    }
    @Override
    public void wash() {
        System.out.println("We can wash car at service bay");
    }
}

class Horses implements Washable{
    @Override
    public void wash() {
        System.out.println("Apply special washing machine");

    }
}

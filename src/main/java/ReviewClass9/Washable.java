package ReviewClass9;

public interface Washable {
    void wash();
}

class WashableTester{
    public static void main(String[] args) {
        Washable[] array={new Car(),new Horses()};
        for(Washable w:array){
            w.wash();
        }
    }
}

package Class20Polymorphism;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] arr={new Computer(), new Apple(), new HP(), new Dell(), new Lenovo()};
        for(Computer c:arr){
            c.printing();
            c.gaming();
            c.internet();
        }
    }
}

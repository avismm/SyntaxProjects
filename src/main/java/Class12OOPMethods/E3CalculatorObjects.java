package Class12OOPMethods;

public class E3CalculatorObjects {

    public static void main(String[] args) {
        E2Calculator calc=new E2Calculator();

       /* To know the object location, Java will check the object to see which
        class inside the package, the object was created from. If the class in which the method was created is in a
        different package, intelliJ will import the package and class automatically

        Note: To change settings in intelliJ, double-click the shift button and type the key
        word of the setting you want to change.
        */
        calc.add();
        calc.subtract();
    }

}

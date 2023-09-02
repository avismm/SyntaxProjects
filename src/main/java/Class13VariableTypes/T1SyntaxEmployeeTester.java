package Class13VariableTypes;

public class T1SyntaxEmployeeTester {
    public static void main(String[] args) {

        T1SyntaxEmployee e1= new T1SyntaxEmployee();
        e1.salary=34000;
        e1.empID="565TTE";

        T1SyntaxEmployee e2= new T1SyntaxEmployee();
        e2.salary=23000;
        e2.empID="56R5TTE";

        e1.printInfor();
        e2.printInfor();
        System.out.println("CEO: "+T1SyntaxEmployee.CEO);

    }

}

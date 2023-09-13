package Class5LogicalOperators;

public class E1SwitchStatement {
    public static void main(String[] args) {
/*Note: Switch does not support certain data types e.g., boolean, float,
double, long. Relational operators are also not supported*/
        int day=5;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
                case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Wrong day");

        }
    }
}

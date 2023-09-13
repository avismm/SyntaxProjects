package Class4Ifelse;

public class T1NextedIfDeplomaOrDegree {
    public static void main(String[] args) {

        boolean degree =false;
        double gpa=3.6;

        if(degree){
            System.out.println("Congratulations");
            if(gpa>3.5){
                System.out.println("You are eligible for scholarship");
            }else {
                System.out.println("You should have studies harder");
        }
        }else {
            System.out.println("You should get a degree");
        }
    }
}

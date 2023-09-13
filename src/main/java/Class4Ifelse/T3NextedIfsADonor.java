package Class4Ifelse;
/*Create a Java program and call it a Donor.
    In order to be eligible to donate your blood
      you have to be 18 years old. Also once you
      identify age eligibility then we have to see
      if person matches weight requirements.
      If person weight it more than 110 lbs →
      then he/she is eligible,
      otherwise we cannot accept such a patient.*/

public class T3NextedIfsADonor {
    public static void main(String[] args) {
        int age =56;
        double weight=340;
        if(age==18){
           if(weight>110){
                System.out.println("You are an eligible patient");
            }
        }else {
            System.out.println("You are not an eligible patient");
        }

    }
}

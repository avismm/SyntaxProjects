package Class19MethodOverloadingAndOverriding;

public class T5Degree {
    public void getPrerequisite(){
        System.out.println("To get a degree, you need a high school diploma");
    }
    public static void main(String[] args) {
new Bachelors().getPrerequisite();
new Masters().getPrerequisite();
//new T5Degree().getPrerequisite();
    }
}
    class Bachelors extends T5Degree{
        public void getPrerequisite(){
            super.getPrerequisite();
        }

    }
class Masters extends T5Degree{

    //Using annotations. This tells java to perform extra checks to ensure the user does not make mistakes.
    @Override
    public void getPrerequisite(){
        System.out.println("To get a masters, you need a degree");
    }

}

package Class12OOP;

public class E2MethodsTester {

    public static void main(String[] args) {
        E2MethodsReturn e2=new E2MethodsReturn();
        E2MethodsReturn e3=new E2MethodsReturn();

        /*In order make the result from the method reusable, we can store
        the result from the method into a variable as below. */
        int result =e2.add(80,80);
        System.out.println(result+" is the result");

//Class12 task2: Calling the multiplier method and storing the result into a variable
        int integer =e3.Tenmultiplier(80);
        System.out.println(integer+" is the result of class12 task2");

        //Class12 task2:
        int large =e3.getLargest(80,67);
        System.out.println(large +" is the larger number for class12 task 3");
        System.out.println(e3.getLargest(80,67) +" is the larger number for class12 task 3");

        //Class12 task2:
        String emailAddress =e3.createEmail("avis","anthem","yahoo");
        System.out.println("Email address is "+emailAddress);
        //System.out.println(e3.getLargest(80,67) +" is the larger number for class12 task 3");
    }

}

package Class17Inheritance;

import Class18Inheritence.Bike;

public class HondaBikeUsingProtectedKeyword extends Bike {
    void printInfo(){
        System.out.println(make);//With protected, only child classes can access the variable
    }
}

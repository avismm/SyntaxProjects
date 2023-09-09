package Class17;

import Class18InheritenceAndSuperKeyword.Bike;

public class HondaBikeUsingProtectedKeyword extends Bike {
    void printInfo(){
        System.out.println(make);//With protected, only child classes can access the variable
    }
}

package Class22Interfaces;

import Class4Ifelse.E4Scanner;

public class BikeTester {
    // We will not get an error when creating the object of the child class.
    HonderBike h=new HonderBike();
    Vehicle v=new HonderBike();

    //The class Object is capable of holding any class
    Object d=new Dog();
    Object r=new HonderBike();
    Object s=new E4Scanner();
    Object o=new String();

}

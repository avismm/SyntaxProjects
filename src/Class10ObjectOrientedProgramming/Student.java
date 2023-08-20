package Class10ObjectOrientedProgramming;

public class Student {
    //properties/attributes
    String name;
    int age;
    String id;
    //methods/functions/behaviours
    void study(){
        System.out.println("Studying 16 hours a day");
    }

    public static void main(String[] args) {
        //were creating an actual student by using the student class
        Student ehabObj=new Student(); //We have created an object ehabObj (an actual student). Note: In Java, a class is also a data type
        ehabObj.name="Ehab";
        ehabObj.age=23;
        ehabObj.id="abkgfgfg";
        ehabObj.study(); // This can be likened with scanner.nextInt() method or behavior.

        Student habibObj=new Student();
        habibObj.name="Habib";
        habibObj.age=34;
        habibObj.id="34hghU";
        habibObj.study(); //Here, we are calling a specific behavior
    }
}

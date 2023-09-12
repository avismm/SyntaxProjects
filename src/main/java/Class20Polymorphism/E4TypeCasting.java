package Class20Polymorphism;

public class E4TypeCasting {
    public static void main(String[] args) {

        //Classes are also data types as seen in the example below.
        /*Student s1=new Student("Alxis","454F846");
        Student s2=new Student("Janifer","F8486N");*/

        //We can create an array and store objects of the same data types as shown below.
        Student[] arr={new Student("Alxis","454F846"),new Student("Janifer","F8486N")};
      //  arr[1].printInfo();

        /*We can use the enhanced for loop and declare a variable c that stores objects from an array of Student class,
        and then call the method from the objects' classes*/
        for(Student c:arr){
           c.printInfo();
        }
    }

    // Storing the Dog object into the parent Class/Data Type
    E1Animal a=new Dog();

    //Type casting to convert a bigger data type to a smaller one.
    Dog d=(Dog)new E1Animal();

}



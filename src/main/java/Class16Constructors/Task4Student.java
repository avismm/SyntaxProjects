package Class16Constructors;

public class Task4Student {
    private String name;
   private String address;

   public Task4Student(String name, String address) {
       this.name = name;
       this.address = address;

   }
    public void displayInfo(){
        System.out.print("Student Name: "+name+", "+"Student Address: "+address);
    }

    public static void main(String[] args) {
        new Task4Student("Joseline", "454tYYU").displayInfo();
    }
}

package ReviewClass6;

public class ThisKeySuperheroes {
    private String name;
    private String power;
    private int age;

    public ThisKeySuperheroes(String name, String power){
        this.name=name;
        this.power=power;

    }
 public ThisKeySuperheroes(String name, String power, int age){
        this(name, power);// calling a constructor inside a constructor
     this.age=age;

    }

    public static void main(String[] args) {

        new ThisKeySuperheroes("superman", "fly");
        new ThisKeySuperheroes("batman","money", 27);
    }


}

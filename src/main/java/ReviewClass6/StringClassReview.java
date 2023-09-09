package ReviewClass6;

public class StringClassReview {
    public static void main(String[] args) {
        String color =new String();
        color="yellow is sunny";
        int age=34;
        age=65;
        System.out.println(age);

        //trim method example
        String obj1=color.trim();
        System.out.println(obj1);

        //split method example
        String[] obj2=color.split(" ");
        System.out.println(obj2[1]);

        //replace method example
        String newColor=color.replace("is sunny","");
        System.out.println(newColor);
    }

}

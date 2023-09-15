package PracticeQuestions;

public class replit152 {
        public replit152(String city){
            System.out.println(city);

        }
        public replit152(){
            System.out.println("Parent Constructor");

        }

    }
    class Child extends replit152{
        public Child(String city) {
            super(city);
        }
    }
    class Tester2{
        public static void main(String[] args){
            new Child("Vienna");

        }
    }

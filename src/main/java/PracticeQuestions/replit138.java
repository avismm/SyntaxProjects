package PracticeQuestions;

public class replit138 {

    private static void Private(){
        System.out.println("private");

    }
    static void Default(){
        System.out.println("default");

    }
    protected static void Protected(){
        System.out.println("protected");

    }

    public static void Public(){
        System.out.println("public");

    }


}

class Main {
    public static void main(String[] args) {
        new replit138().Default();
        new replit138().Protected();
        new replit138().Public();

    }
}



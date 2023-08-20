package Class93DArrays;

public class E53DSArrays {
    public static void main(String[] args) {

        String[][] students={
                {"john","peter","Isaac","Haman"},
                {"A","A+","C","B"}};

        for (int row = 0; row < students[0].length; row++) {
            if(students[1][row].equals("A")||students[1][row].equals("B")){
            System.out.println(students[0][row]);}
        }
}

}

package Class7;
/*Create an array to store char values and
  then print those in reverse order*/
public class Task7ArrayOfCharReverseOrder {
    public static void main(String[] args) {
        char [] cha={'A','B', 'C','D','E'};
        for (int i = 4; i>=0&&i<=cha.length; i--) {
            System.out.print(" "+cha[i]+",");

        }
    }
}

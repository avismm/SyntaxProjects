package Class11OOP;

/*How would you reverse a String word by word? for example
// input=>This is sentence i want to reverse
//output=>sihT si ecnetnes i tnaw ot esrever*/

public class HW4OtherOtherStringMethods {
    public static void main(String[] args) {
        String a="This is sentence i want to reverse";
        String[] newString=a.split(" ");
        String b = newString[0];
        String c = newString[1];
        String d = newString[2];
        String e = newString[3];
        String f = newString[4];
        String g = newString[5];
        String h = newString[6];

        for (int i = b.length()-1; i >=0 ; i--) {
            System.out.print(b.charAt(i));
        }
        System.out.print(" ");
        for (int i = c.length()-1; i >=0 ; i--) {
            System.out.print(c.charAt(i));

        }
        System.out.print(" ");
        for (int i = d.length()-1; i >=0 ; i--) {
            System.out.print(d.charAt(i));

        }
        System.out.print(" ");
        for (int i = e.length()-1; i >=0 ; i--) {
            System.out.print(e.charAt(i));

        }
        System.out.print(" ");
        for (int i = f.length()-1; i >=0 ; i--) {
            System.out.print(f.charAt(i));

        }
        System.out.print(" ");
        for (int i = g.length()-1; i >=0 ; i--) {
            System.out.print(g.charAt(i));

        }
        System.out.print(" ");
        for (int i = h.length()-1; i >=0 ; i--) {
            System.out.print(h.charAt(i));

        }
    }

}

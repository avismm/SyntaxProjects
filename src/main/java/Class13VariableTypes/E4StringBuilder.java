package Class13VariableTypes;

public class E4StringBuilder {
    public static void main(String[] args) {

        //String class has a special treatment where we don't need to use the new keyword.
        String str=new String("Avis");
       String name="Avis";

        StringBuilder stringBuilder=new StringBuilder("Avis");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        stringBuilder.deleteCharAt(0);
        System.out.println(stringBuilder);
        stringBuilder.append("Muhwerane");
        System.out.println(stringBuilder);

    }

}

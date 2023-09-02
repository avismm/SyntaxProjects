package Class14AccessModifiers;

public class T1AccessModifiers {

    // Here, we are using the default access modifier.
     int arraySum (int[] arrayTask){
        int sum=0;
        for (int i = 0; i < arrayTask.length; i++) {
            sum=sum+arrayTask[i];

        }
        return sum;
    }
}

package Class3;
//This is the conversion from one data type to another
public class E2TypeCasting {
    public static void main(String[] args) {
        //Recap: byte->short->int->long->float->double

        float box1=18.0f;
        int box2=8;
        //type casting example
        box1=box2;
        System.out.println(box2);

        float boxA=18.0f;
        int boxB=8;
        //type casting example
        boxB=(int)boxA;//This is called explicit/narrowing/manual type casting
        System.out.println(boxB);



    }
}

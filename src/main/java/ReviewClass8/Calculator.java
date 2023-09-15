package ReviewClass8;

public class Calculator {
    void add(int a, int b){
        System.out.println(a+b);
    } int add(int a, int b, int c){
        return a+b+c;
    }

    //using the var args to create a flexible loop
    int add(int...arr){
        int sum=0;
        for(int a:arr){
            sum+=a;
        }
        System.out.println(sum);
        return sum;
    }

}

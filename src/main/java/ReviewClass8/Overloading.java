package ReviewClass8;

public class Overloading {
    public void print(){
        System.out.println("Hello");
    }public void print(String word){
        System.out.println("word");
    }public void print(String word, int number){
        System.out.println("Hello");
    }public void print(int num, String word){
        System.out.println("Hello");
    }
    public void print(double weight){
        System.out.println(weight);
    }

    //var args (variable arguments). This makes the parameters optional and allows user to pass as many parameters
    public void print(int...a){
        for(int num:a){
            System.out.println(num);
        }
     System.out.println(a[3]);
    }
}

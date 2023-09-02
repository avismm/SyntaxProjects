package Class15Constructors;

public class Task1Constructors {
    String var1;
    String var2;
    public Task1Constructors(String cVar1, String cVar2){
        var1=cVar1;
        var2=cVar2;
        System.out.println(var1+", "+var2);
    }
    public Task1Constructors(){
      var1="animal";
        System.out.println(var1);
    }
}

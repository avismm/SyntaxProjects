package Class18InheritenceAndSuperKeyword;

public class T1UserClass {
    String name;
    String mobileNo;
    public T1UserClass(String name, String mobileNo){
    this.name=name;
    this.mobileNo=mobileNo;

    }
}
class UserInfo extends T1UserClass {
    String address;

    //declaring the constructor for UserInfo
    public UserInfo(String name, String mobileNo, String address){

      /*calling the constructor from the parent class
    to initialize the instance fields of the parent class*/
        super(name,mobileNo);

        //initializing the additional address field
        this.address=address;

    }
    void userDetails(){
        System.out.println(name+", "+mobileNo+", "+address);
    }

}
class UserTester {
    public static void main(String[] args) {
        UserInfo user=new UserInfo("Alexix","980044554","45454-099");
        user.userDetails();
    }

}

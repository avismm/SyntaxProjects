package Class23Encapsulation;

public class E2User {
    String name;
    int age;
    String userName;
    String password;

    public E2User(String name, int age, String userName, String password) {
        //We can use the setter methods to set the values of the instance variables instead is initializing them using the constructor
        setAge(age);
        setName(name);
        setUserName(userName);
        /*this.name = name;
        this.age = age;
        this.userName = userName;
        this.password = password;*/
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

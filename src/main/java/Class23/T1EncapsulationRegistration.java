package Class23;

import java.util.Scanner;

public class T1EncapsulationRegistration {
    Scanner input=new Scanner(System.in);
    private String email;
    private String userName;
    private String password;

    public T1EncapsulationRegistration(String email, String userName, String password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    public void setEmail(String email){
        do{
            System.out.println("Input email");
            userName=input.nextLine();
            this.email=email;

        }while (email.isEmpty()||!email.contains("@yahoo.com"));
    }
    public void setUserName(String userName){

        do{
            System.out.println("Input username");
            userName=input.nextLine();
            this.userName=userName;

        }while (userName.isEmpty());
    }
    public void setPassword(String password){

        do{
            System.out.println("Input password");
            password=input.nextLine();
            this.password=password;

        }while (password.isEmpty());
    }

    String getEmail(){
        return email;
    }
    String getUserName(){
        return userName;
    }String getPassword(){
        return password;
    }

}

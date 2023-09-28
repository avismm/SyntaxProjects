package PracticeQuestions;

public class Encapsulation182 {
    public static void main (String[] args){
        Persons obj=new Persons("John", "Doe", 10,25,1900,"123-45-6789");
        System.out.println(obj.getFirstName());
        System.out.println( obj.getLastName());
        System.out.println(obj.formatBirthday());
        System.out.println(obj.getSsn());
    }

}

class Persons{
    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthDay;
    private int birthYear;
    private String ssn;

    public Persons(String firstName, String lastName, int birthMonth, int birthDay, int birthYear, String ssn){
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthDay=birthDay;
        this.birthMonth=birthMonth;
        this.birthYear=birthYear;
        this.ssn=ssn;
    }

    public String getFirstName(){
        return firstName;
    }


    public String getLastName(){
        return lastName;
    }


    public int getBirthDay(){
        return birthDay;
    }


    public int getBirthMonth(){
        return birthMonth;
    }
    public int getBirthYear(){
        return birthYear;
    }
    public String getSsn(){
        return ssn;
    }

    public String formatBirthday(){
        String formated=birthMonth+"/"+birthDay+"/"+birthYear;
        return(formated);
    }
}

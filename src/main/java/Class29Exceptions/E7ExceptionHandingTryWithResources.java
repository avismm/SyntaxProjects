package Class29Exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class E7ExceptionHandingTryWithResources {
    public static void main(String[] args) {

        //try with resources allows us to close the resources (our file) as well as handle the IO exception
        try (FileInputStream  file=new FileInputStream("C:\\Users\\LENOVO\\IdeaProjects\\SyntaxProjects\\Files\\EmployeesTestSheet.xlsx")){

        } catch (IOException f) {
            System.out.println("Please check the file path");
        }
    }

}

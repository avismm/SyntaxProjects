package Class29Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E6ExceptionHandingKeywords {
    public static void main(String[] args) {
        FileInputStream file=null;

        try {
            file=new FileInputStream("C:\\Users\\LENOVO\\IdeaProjects\\SyntaxProjects\\Files\\EmployeesTestSheet.xlsx");

        } catch (FileNotFoundException e) {
            System.out.println("Please check the file path");

            //finally is used to close critical system resources. It was heavily used before java 7.
        }finally {
            try{
                if(file!=null)
            file.close();
            }catch (IOException e){
                System.out.println(e);

            }

        }
    }

}

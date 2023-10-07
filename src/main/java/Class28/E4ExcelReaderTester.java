package Class28;

import Utilities.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class E4ExcelReaderTester {
    public static void main(String[] args) throws IOException {
       List<Map<String, String>> data= ExcelReader.readExcelData("C:\\Users\\LENOVO\\IdeaProjects\\SyntaxProjects\\Files\\Employees.xlsx","Sheet1");
        System.out.println(data.get(0));
    }
}

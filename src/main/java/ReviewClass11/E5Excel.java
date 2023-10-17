package ReviewClass11;

import Utilities.ExcelReader;

import java.util.List;
import java.util.Map;

public class E5Excel {
    public static void main(String[] args) {
        List<Map<String, String>> data= ExcelReader.readExcelData("C:\\Users\\LENOVO\\IdeaProjects\\SyntaxProjects\\Files\\Employees.xlsx");
        System.out.println(data);
    }
}

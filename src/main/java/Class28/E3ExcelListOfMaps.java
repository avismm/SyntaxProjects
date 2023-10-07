package Class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class E3ExcelListOfMaps {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\LENOVO\\IdeaProjects\\SyntaxProjects\\Files\\Employees.xlsx";

        //loading the file into memory from its permanent storage
        FileInputStream fis=new FileInputStream(path);

        //creating an object of the XSSWorkbook class and storing it in a workbook variable.
        //This specific class XSSFWorkbook works with Excel files
        XSSFWorkbook workbook =new XSSFWorkbook(fis);

        //The method getSheet is called on the workbook object.
        // It attempts to retrieve a sheet with the name "Sheet1" from the workbook
        Sheet sheet =workbook.getSheet("Sheet1");

        //Creating a nested data structure that is going to hold all the info from the sheet
        //The data will be an ArrayList of Maps
        List<Map<String, String>> empListMap=new ArrayList<>();

        //getting the first header row from the Excel file and storing it in the headerRow variable.
        Row headerRow=sheet.getRow(0);

        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            //getting all the rows one by one and placing them inside the row variable
            Row row=sheet.getRow(i);//At iteration 1, row1 will be stored in the variable row.

            //Declaring a Map which we will use to add the objects into the emptyList. At this step, the map is empty.
            Map<String, String> rowMap= new LinkedHashMap<>();

            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                //Converting cell values to String and adding key value pairs into the Map
                String keyCell=headerRow.getCell(j).toString();
                String valueCell=row.getCell(j).toString();
                rowMap.put(keyCell,valueCell);
            }
            empListMap.add(rowMap);
        }
        System.out.println(empListMap);
    }
}

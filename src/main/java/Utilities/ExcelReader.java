package Utilities;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {

    //The method will return a list of Maps
    public static List<Map<String, String>> readExcelData(String path, String sheetName) {
        //Creating a nested data structure that is going to hold all the info from the sheet
        //The data will be an ArrayList of Maps
        List<Map<String, String>> empListMap = new ArrayList<>();
        try (//loading the file into memory from its permanent storage
             FileInputStream fis = new FileInputStream(path);

             //creating an object of the XSSWorkbook class and storing it in a workbook variable.
             //This specific class XSSFWorkbook works with Excel files
             XSSFWorkbook workbook = new XSSFWorkbook(fis);) {
            //The method getSheet is called on the workbook object.
            // It attempts to retrieve a sheet with the name sheetName from the workbook
            Sheet sheet = workbook.getSheet(sheetName);

            //getting the first header row from the Excel file and storing it in the headerRow variable.
            Row headerRow = sheet.getRow(0);

            for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
                //getting all the rows one by one and placing them inside the row variable
                Row row = sheet.getRow(i);//At iteration 1, row1 will be stored in the variable row.

                //Declaring a Map which we will use to add the objects into the emptyList. At this step, the map is empty.
                Map<String, String> rowMap = new LinkedHashMap<>();

                for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                    //Converting cell values to String and adding key value pairs into the Map
                    String keyCell = headerRow.getCell(j).toString();
                    String valueCell = row.getCell(j).toString();
                    rowMap.put(keyCell, valueCell);
                }
                empListMap.add(rowMap);
            }

        } catch (IOException io) {
            io.printStackTrace();
        }
//Class that brings the data in the form of bytes into the memory
        return empListMap;
    }

    public static List<Map<String, String>> readExcelData(String path) {

        return readExcelData(path, "Sheet1");
    }

    public static List<Map<String, String>> readExcelData() {

        return readExcelData(Constants.EXCEL_FILE_PATH, "Sheet1");
    }
}

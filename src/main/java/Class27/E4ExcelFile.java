package Class27;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E4ExcelFile {
    public static void main(String[] args) throws IOException {

        //declaring the path of the file
        String path="C:\\Users\\LENOVO\\IdeaProjects\\SyntaxProjects\\Files\\Employees.xlsx";

        //loading the file into memory from its permanent storage
        FileInputStream fis=new FileInputStream(path);

    //creating an object of the XSSWorkbook class and storing it in a workbook variable.
        //This specific class XSSFWorkbook works with Excel files
        XSSFWorkbook workbook =new XSSFWorkbook(fis);

        //The method getSheet is called on the workbook object.
        // It attempts to retrieve a sheet with the name "Sheet1" from the workbook
        Sheet sheet =workbook.getSheet("Sheet1");

/*sheet: This is an instance of a sheet object, typically obtained from a workbook using a library like Apache POI.
getRow(1): This method is called on the sheet object. It retrieves the row at the specified index, in this case, index 1.
In many programming libraries like Apache POI, row indexes are zero-based,
so index 1 corresponds to the second row in the sheet (since the first row has an index of 0).
Row row: If a row exists at index 1 in the sheet, it is returned by the getRow method and assigned to the row variable.
Row is a class or interface (depending on the specific library version)
that represents an individual row within an Excel sheet.*/
        Row row=sheet.getRow(1);
        Cell cell=row.getCell(3);
        System.out.println(cell);

    }

}

package Class28;

import Utilities.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class T1ExcelReader {
    public static void main(String[] args) throws IOException {
        List<Map<String, String>> data= ExcelReader.readExcelData();
        System.out.println(data);
    }
}

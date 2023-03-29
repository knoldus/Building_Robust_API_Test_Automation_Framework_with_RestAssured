package api.utilities;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class Utility {
    public FileInputStream fi;
    public FileOutputStream fo;
    public XSSFWorkbook workbook;
    public XSSFSheet sheet;
    public XSSFRow row;
    public XSSFCell cell;
    public CellStyle style;
    String path;
    public Utility(String path){
        this.path = path;
    }
    public int getRowCount(String SheetName) throws IOException {
        fi = new FileInputStream(path);
        workbook = new XSSFWorkbook(fi);
        sheet = workbook.getSheet(SheetName);
        int rowCount = sheet.getLastRowNum();
        workbook.close();
        fi.close();
        return rowCount;
    }

    public int getCellCount(String SheetName, int rowNum) throws IOException{
        fi = new FileInputStream(path);
        workbook = new XSSFWorkbook(fi);
        sheet = workbook.getSheet(SheetName);
        row = sheet.getRow(rowNum);
        int cellCount = row.getLastCellNum();
        workbook.close();
        fi.close();
        return cellCount;
    }

    public String getCellData(String SheetName, int rowNum, int colNum) throws IOException{
        fi = new FileInputStream(path);
        workbook = new XSSFWorkbook(fi);
        sheet = workbook.getSheet(SheetName);
        row = sheet.getRow(rowNum);
        cell = row.getCell(colNum);

        DataFormatter formatter = new DataFormatter();
        String data;
        try{
            data = formatter.formatCellValue(cell);
        }
        catch (Exception e){
            data = "";
        }
        workbook.close();
        fi.close();
        return data;
    }
}

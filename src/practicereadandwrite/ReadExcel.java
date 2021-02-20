package practicereadandwrite;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcel {
static String filePath= "../PracticeJAVA/DataTest/Book1.xlsx";

    public static void main(String[] args) throws IOException {
        ReadExcel.readExcel(filePath, 0);

    }
    public static void readExcel(String filePath, int sheetNumber) throws IOException {
        FileInputStream fileInputStream= new FileInputStream(filePath);
        Workbook workbook= new XSSFWorkbook(fileInputStream);
        Sheet sheet= workbook.getSheetAt(sheetNumber);

        Iterator<Row> rowIterator= sheet.iterator();
        while(rowIterator.hasNext()) {
            Row row = rowIterator.next();

            Iterator<Cell> cellIterator = row.iterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();

                if (cell.getCellType()== CellType.STRING){
                    System.out.print(cell.getStringCellValue()+"  ");
                } else if (cell.getCellType()==CellType.NUMERIC){
                    System.out.print(cell.getNumericCellValue()+"  ");
                }
            }
            System.out.println();
        }
    }

}





























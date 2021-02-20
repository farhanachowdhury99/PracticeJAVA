package practicereadandwrite;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcel1 {

    static String filePath="../PracticeJAVA/DataTest/Book2.xlsx";

    public static void main(String[] args) {

        ReadExcel1.readExcel(filePath,0);
    }

    public static void readExcel(String filePath, int sheetNumber)  {

        try {


            FileInputStream inputStream = new FileInputStream(filePath);
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet sheet = workbook.getSheetAt(sheetNumber);

            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();

                Iterator<Cell> cellIterator = row.iterator();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();

                    if (cell.getCellType() == CellType.STRING) {
                        System.out.print(cell.getStringCellValue()+"     ");


                    } else if (cell.getCellType() == CellType.NUMERIC) {
                        System.out.print(cell.getNumericCellValue()+"   ");
                    }
                }
                System.out.println();
            }

        } catch(FileNotFoundException fn){
            System.out.println("File not found");
        } catch(IOException io){
            System.out.println("Done");
        }
    }
}

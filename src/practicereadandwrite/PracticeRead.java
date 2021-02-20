package practicereadandwrite;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class PracticeRead {

    static String filePath = "../PracticeJAVA/DataTest/Book1.xlsx";

    public static void main(String[] args) {

PracticeRead.readExcel(filePath,0);
    }

    public static void readExcel(String filepath, int sheetNumber) {

        try {


            FileInputStream inputStream = new FileInputStream(filepath);
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
                        System.out.print(cell.getNumericCellValue()+"        ");
                    }

                }
                System.out.println();
            }
        } catch (FileNotFoundException fn) {
            System.out.println("File not found");
        } catch (IOException io) {
            System.out.println("Reading done");
        }


    }
}


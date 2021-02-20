package practicereadandwrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteEXCEL2 {

    public static final String filePath="../PracticeJAVA/DataTest/Book3.xlsx";

    public static void main(String[] args) {
        Object[][] stInfo={
                {"RollNo","name","Score"},
                {"1","Lisa","100"},
                {"2", "Istihaque","90"}

        };
        WriteEXCEL2.writeExcel(filePath,"School",stInfo);

    }

    public static void writeExcel(String filePath, String sheetName, Object[][] data){
        XSSFWorkbook workbook= new XSSFWorkbook();
        XSSFSheet sheet= workbook.createSheet(sheetName);

        int rowNum=0;
        System.out.println("Excel sheet created");

        for (Object[] dat: data){
            Row row=sheet.createRow(rowNum++);

            int coulmnNum=0;
            for (Object da:dat){
                Cell cell= row.createCell(coulmnNum++);

                if (da instanceof String){
                    cell.setCellValue((String) da);
                } else if (da instanceof Integer){
                    cell.setCellValue((Integer) da);
                }
            }
        }

        try {
            FileOutputStream outputStream= new FileOutputStream(filePath);
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

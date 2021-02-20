package practicereadandwrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {

    public static final String filePath="../PracticeJAVA/DataTest/ExcelFile.xlsx";


    public static void main(String[] args) throws IOException {
        Object[][] stName={
                {"sl","firstNAME","LastName"},
                {"101","Farhana","Chowdhury"},
                {"201","Alisha","Amira"}

        };
ExcelWrite.writeExcel(filePath,"pnt",stName);


    }
     public static void writeExcel(String filePath, String sheetName, Object[][] data) throws IOException {
         XSSFWorkbook workbook= new XSSFWorkbook();
         XSSFSheet sheet= workbook.createSheet(sheetName);

         int rowNum=0;
         System.out.println("Excel file created");

         for(Object[] da:data){
             Row row=sheet.createRow(rowNum++);

             int columnNum=0;
             for (Object d:da){
                 Cell cell=row.createCell(columnNum++);

                 if (d instanceof String){
                     cell.setCellValue((String) d);

                 } else if(d instanceof Integer){
                     cell.setCellValue((Integer) d);
                 }
             }
         }
         try {
             FileOutputStream outputStream= new FileOutputStream(filePath);
             workbook.write(outputStream);
             workbook.close();
         } catch (FileNotFoundException fn){
             System.out.println("File not found");
         } catch(IOException io){
             System.out.println("Done");
         }



     }





}

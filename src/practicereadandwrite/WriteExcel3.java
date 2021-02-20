package practicereadandwrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel3 {

    public static final String filePath="../PracticeJAVA/DataTest/ExcelFile4.xlsx";

    public static void main(String[] args) throws FileNotFoundException {

        Object[][] stIn= {
                {"sl", "Name", "Score"},
                {"101", "Farhana", "100"},
                {"102", "Lisa", "100"},
        };
                WriteExcel3.writeExcel(filePath,"PNT",stIn);


    }

    public static void writeExcel(String filePath, String sheetName, Object[][] data) throws FileNotFoundException{
        XSSFWorkbook workbook= new XSSFWorkbook();
        XSSFSheet sheet= workbook.createSheet(sheetName);

        int rowNum=0;
        System.out.println("Worksheet created");
        for(Object[] dat:data){
            Row row= sheet.createRow(rowNum++);

            int columnNum=0;
            for(Object da: data){
                Cell cell=row.createCell(columnNum++);

            if (da instanceof String){
                cell.setCellValue((String) da);
            } else if(da instanceof Integer){
                cell.setCellValue((Integer) da);
            }

            }
        }
        try {

            FileOutputStream fileOutputStream= new FileOutputStream(filePath);
            workbook.write(fileOutputStream);
            workbook.close();
        } catch(FileNotFoundException fn){
            System.out.println("File not found");
        } catch(IOException io){
            System.out.println("done");
        }
    }
}

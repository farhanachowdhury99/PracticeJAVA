package practicereadandwrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {

    public static final String File_Path= "../PracticeJAVA/DataTest/sampleExcelFile.xlsx";


    public static void main(String[] args) throws FileNotFoundException {
        Object[][] stDetails= {
                {"sl", "FirstName", "LastName"},
                {"101", "farhana", "Chowdhuey"},
                {"102", "Sanjana", "Chowdhury"}


        };
    WriteExcel.writeExcel(File_Path,"PNT",stDetails);

    }

    public static void writeExcel(String filePath, String sheetName, Object[][] data) throws FileNotFoundException {
        XSSFWorkbook workbook= new XSSFWorkbook();
        XSSFSheet sheet= workbook.createSheet(sheetName);

        int rowNum=0;
        for (Object[] ob: data){
            Row row= sheet.createRow(rowNum++);

            int columnNum=0;
            for (Object dt: ob){
                Cell cell= row.createCell(columnNum++);


                if (dt instanceof String){
                    cell.setCellValue((String)dt);

                } else if (dt instanceof Integer){
                    cell.setCellValue((Integer)dt);
                }
            }
        }
        try {
            FileOutputStream fileOutput = new FileOutputStream(filePath);
            workbook.write(fileOutput);
            workbook.close();

        } catch(FileNotFoundException fn){
            System.out.println("File not Found");


        } catch (IOException e) {
           // e.printStackTrace();
            System.out.println("Done");
        }


    }





}

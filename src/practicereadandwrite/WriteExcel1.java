package practicereadandwrite;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel1 {

    public static final String filePath="../PracticeJAVA/DataTest/Book3";

    public static void main(String[] args) throws IOException {
        Object[][] stInfor={
                {"sl","FirstName","lastName" },
                {"100","Lisa","Chowdhury"},
                {"200","Sanjana","Islam"}

        };
        WriteExcel1.writeExcel(filePath,"PNT",stInfor);


    }

    public static void writeExcel(String filePath, String sheetName, Object[][] data) throws IOException {
        XSSFWorkbook workbook= new XSSFWorkbook();
        XSSFSheet sheet= workbook.createSheet(sheetName);

        int rowNum=0;
        System.out.println("Excel sheet created");

        for(Object[] dat: data){
            Row row=sheet.createRow(rowNum++);

            int columnNum=0;
            for (Object da:dat){
                Cell cell= row.createCell(columnNum++);

                if (da instanceof String){
                    cell.setCellValue((String) da);
                } else if(da instanceof Integer){
                    cell.setCellValue((Integer) da);
                }
            }
        }
        try {
            FileOutputStream outputStream = new FileOutputStream(filePath);
            workbook.write(outputStream);
            workbook.close();

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


}
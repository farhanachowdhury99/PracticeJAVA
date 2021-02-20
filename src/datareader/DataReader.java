package datareader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DataReader {
    //C:\Users\farha\IdeaProjects\PracticeJAVA\DataTest\Sample.Txt
   // DataTest/Sample.Txt

    public static void main(String[] args) {
        DataReader.readData();

    }

        public static void readData(){
            FileReader fileReader = null;
            BufferedReader bufferedReader = null;

            String filePath = "../PracticeJAVA/DataTest/Sample.Txt";


            try {
                fileReader = new FileReader(filePath);
                bufferedReader = new BufferedReader(fileReader);
                String data;
                while ((data = bufferedReader.readLine()) != null) {

                    System.out.println(data);
                }


            } catch (Exception e) {
                System.out.println("File not found exception");
            } finally {
                try {
                    fileReader.close();
                    bufferedReader.close();
                } catch (Exception e) {
                    System.out.println("File already closed");
                }


            }
        }
    }


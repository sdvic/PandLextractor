/**
 * Created by VicMini on 7/22/17.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PandLextractor
{
    /****************************************************************************************
     * Application to extract Cash Flow data from Quick Books P&L
     ****************************************************************************************/


        InputStream excelFileToRead;
        FileOutputStream fileOut;
        static XSSFWorkbook wb;
        static XSSFSheet sheet;
        XSSFRow row;
        XSSFCell cell;
        static Iterator<Row> rowIterator;
        static Iterator<Cell> cellIterator;

        public static void main(String[] args) throws IOException
        {
            FileInputStream inputStream = new FileInputStream(new File("/Users/VicMini/Desktop/PLJantoDec2016.xlsx"));
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet firstSheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = firstSheet.iterator();
            String cellString = "???";
            while (iterator.hasNext()) {
                Row nextRow = iterator.next();
                Iterator<Cell> cellIterator = nextRow.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            cellString = cell.getStringCellValue().substring(0, 5);
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if(cellString.substring(0, 5).equals("62890"))
                                System.out.print("rent = " + cell.getNumericCellValue());
                            break;
                    }
                }
            }
            workbook.close();
            inputStream.close();
        }
}

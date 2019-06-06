package cwiczenia;


import com.sun.media.sound.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class Budzet {

    public static String SAMPLE_EXCEL = "C:\\Users\\UltraGroup\\Desktop\\tekst\\budzet_kowalskich.xls";

    public double getSuma(){
        Workbook workbook = null;
        try {
            workbook = WorkbookFactory.create(new File(SAMPLE_EXCEL));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Retrieving the number of sheets in the Workbook
        System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");


        Iterator<Sheet> sheetIterator = workbook.sheetIterator();
        System.out.println("Pobieranie arkusza za pomocą :Iterator");

        while (sheetIterator.hasNext()) {
            Sheet sheet = sheetIterator.next();
            System.out.println("=> " + sheet.getSheetName());
        }
        Sheet sheet = workbook.getSheetAt(0);
        DataFormatter dataFormatter = new DataFormatter();


        System.out.println("\n\nIiterowanie po wierszach i kolumnach za pomocą Iteratora\n");
        Iterator<Row> rowIterator = sheet.rowIterator();
        double suma = 0;
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();

            if (row.getRowNum()!=0) {
                double przychody = row.getCell(1).getNumericCellValue();
                double wydatki = row.getCell(3).getNumericCellValue();
                suma += przychody - wydatki;
            }

        }

       return suma;
    }



}
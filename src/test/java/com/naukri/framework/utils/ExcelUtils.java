package com.naukri.framework.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {


public static Object[][] getExcelData(String filePath, String sheetName) {

    Object[][] data = null;

    try {

        FileInputStream fis = new FileInputStream(filePath);

        Workbook workbook = new XSSFWorkbook(fis);

        Sheet sheet = workbook.getSheet(sheetName);

        int rows = sheet.getPhysicalNumberOfRows();
        int cols = sheet.getRow(0).getPhysicalNumberOfCells();

        data = new Object[rows - 1][cols];

        for (int i = 1; i < rows; i++) {

            Row row = sheet.getRow(i);

            for (int j = 0; j < cols; j++) {

                data[i - 1][j] = row.getCell(j).toString();

            }
        }

        workbook.close();
        fis.close();

    } catch (IOException e) {

        e.printStackTrace();

    }

    return data;
}


}

package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataProvider1 {
	
	public File f = new File("C:\\Users\\SANDESH\\Desktop\\AUTOMATION TESTING\\Selenium\\Project_Retree\\pomframework\\src\\test\\resources\\TestData\\TestData.xlsx");

	@DataProvider
	public Object[][] dataset_navigation() throws BiffException, IOException
	{	
    	FileInputStream fis = new FileInputStream(f);
    	DataFormatter formatter = new DataFormatter();
    	XSSFWorkbook wb = new XSSFWorkbook(fis);
    	XSSFSheet Sheet = wb.getSheet("Navigation");
    	XSSFRow hrow = Sheet.getRow(0);
    	int rows = Sheet.getPhysicalNumberOfRows();
    	int col = hrow.getLastCellNum();
		Object testdata[][] = new Object[rows-1][col] ;
		for(int i=0;i<rows-1;i++){
			XSSFRow row = Sheet.getRow(i+1);
			for(int j=0;j<col;j++) {
				if(row==null) {
					testdata[i][j]=" ";
				}else {
					XSSFCell cell = row.getCell(j);
					if(cell==null) {
						testdata[i][j]=" ";
					}else {
						String value = formatter.formatCellValue(cell);
						testdata[i][j] = value;
					}
				}
			}
		}
		return testdata;
	}
	@DataProvider
	public Object[][] dataset_login() throws BiffException, IOException
	{	
    	FileInputStream fis = new FileInputStream(f);
    	DataFormatter formatter = new DataFormatter();
    	XSSFWorkbook wb = new XSSFWorkbook(fis);
    	XSSFSheet Sheet = wb.getSheet("Login");
    	XSSFRow hrow = Sheet.getRow(0);
    	int rows = Sheet.getPhysicalNumberOfRows();
    	int col = hrow.getLastCellNum();
		Object testdata[][] = new Object[rows-1][col] ;
		for(int i=0;i<rows-1;i++){
			XSSFRow row = Sheet.getRow(i+1);
			for(int j=0;j<col;j++) {
				if(row==null) {
					testdata[i][j]=" ";
				}else {
					XSSFCell cell = row.getCell(j);
					if(cell==null) {
						testdata[i][j]=" ";
					}else {
						String value = formatter.formatCellValue(cell);
						testdata[i][j] = value;
					}
				}
			}
		}
		return testdata;
	}
	@DataProvider
	public Object[][] dataset_register() throws BiffException, IOException
	{	
    	FileInputStream fis = new FileInputStream(f);
    	DataFormatter formatter = new DataFormatter();
    	XSSFWorkbook wb = new XSSFWorkbook(fis);
    	XSSFSheet Sheet = wb.getSheet("register");
    	XSSFRow hrow = Sheet.getRow(0);
    	int rows = Sheet.getPhysicalNumberOfRows();
    	int col = hrow.getLastCellNum();
		Object testdata[][] = new Object[rows-1][col] ;
		for(int i=0;i<rows-1;i++){
			XSSFRow row = Sheet.getRow(i+1);
			for(int j=0;j<col;j++) {
				if(row==null) {
					testdata[i][j]=" ";
				}else {
					XSSFCell cell = row.getCell(j);
					if(cell==null) {
						testdata[i][j]=" ";
					}else {
						String value = formatter.formatCellValue(cell);
						testdata[i][j] = value;
					}
				}
			}
		}
		return testdata;
	}

	@DataProvider
	public Object[][] RemoveCart() throws BiffException, IOException {
		{
			FileInputStream fis = new FileInputStream(f);
			DataFormatter formatter = new DataFormatter();
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet Sheet = wb.getSheet("RemoveCart");
			XSSFRow hrow = Sheet.getRow(0);
			int rows = Sheet.getPhysicalNumberOfRows();
			int col = hrow.getLastCellNum();
			Object testdata[][] = new Object[rows - 1][col];
			for (int i = 0; i < rows - 1; i++) {
				XSSFRow row = Sheet.getRow(i + 1);
				for (int j = 0; j < col; j++) {
					if (row == null) {
						testdata[i][j] = " ";
					} else {
						XSSFCell cell = row.getCell(j);
						if (cell == null) {
							testdata[i][j] = " ";
						} else {
							String value = formatter.formatCellValue(cell);
							testdata[i][j] = value;
						}
					}
				}
			}return testdata;
		}
	}
	@DataProvider
	public Object[][] Search() throws BiffException, IOException {
		{
			FileInputStream fis = new FileInputStream(f);
			DataFormatter formatter = new DataFormatter();
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet Sheet = wb.getSheet("Search");
			XSSFRow hrow = Sheet.getRow(0);
			int rows = Sheet.getPhysicalNumberOfRows();
			int col = hrow.getLastCellNum();
			Object testdata[][] = new Object[rows - 1][col];
			for (int i = 0; i < rows - 1; i++) {
				XSSFRow row = Sheet.getRow(i + 1);
				for (int j = 0; j < col; j++) {
					if (row == null) {
						testdata[i][j] = " ";
					} else {
						XSSFCell cell = row.getCell(j);
						if (cell == null) {
							testdata[i][j] = " ";
						} else {
							String value = formatter.formatCellValue(cell);
							testdata[i][j] = value;
						}
					}
				}
			}return testdata;
		}
	}
}
   

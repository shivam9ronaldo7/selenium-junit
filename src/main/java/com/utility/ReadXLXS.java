package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXLXS {

	//Giving path of the file
	String xlsxFilePath = "C:\\Users\\student_v\\Desktop\\myFile.xlsx";

	XSSFWorkbook myWorkbook;
	XSSFSheet mySheet;
	XSSFRow myRow;
	XSSFCell myCell;

	void readIntoXSSFWorkbook() {

		//Creating a blank workbook
		myWorkbook = new XSSFWorkbook();

		//Getting sheet from workbook
		mySheet = myWorkbook.getSheetAt(0);

		//Getting row from worksheet
		myRow = mySheet.getRow(0);

		//Getting cell from row
		myCell = myRow.getCell(0);

		System.out.println(myCell.getStringCellValue());

	}

	void readFromXLSXWorkbook() {

		try {
			FileInputStream fout = new FileInputStream(new File(xlsxFilePath));
			//myWorkbook.write(fout);
			fout.close();
			System.out.println("Done");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		ReadXLXS r = new ReadXLXS();
		double a=10.0;
		int x=(int) a;
	}

}

package com.utility.apachepoi;

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

}

package com.brainmentors.ims.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

import com.brainmentors.ims.user.dto.StudentDTO;

public class ExcelReader {
	public static ArrayList<StudentDTO> readXLS(File path) throws IOException {
		FileInputStream fs = new FileInputStream(path);
		HSSFWorkbook workBook = new HSSFWorkbook(fs);
		HSSFSheet workSheet =   workBook.getSheetAt(0);
		Iterator<Row> rows = workSheet.rowIterator();
		boolean isHeading = false;
		ArrayList<StudentDTO> students = new ArrayList<>();
		while(rows.hasNext()) {
			Row currentRow = rows.next();
			int cellCounter = 1;
			StudentDTO student = new StudentDTO();
			if(!isHeading) {
				isHeading = true;
				continue;
			}
			Iterator<Cell> cells = currentRow.cellIterator();
			while(cells.hasNext()) {
				Cell currentCell = cells.next();
				if(currentCell.getCellType()==CellType.STRING) {
					String val =currentCell.getStringCellValue();
					if(cellCounter==1) {
						student.setId(val);
					}
					else
					if(cellCounter==2) {
						student.setName(val);
					}
					
					
					System.out.print("String Cell is "+currentCell.getStringCellValue());
				}else
				if(currentCell.getCellType()==CellType.NUMERIC) {
						double val = currentCell.getNumericCellValue();
						if(cellCounter==3) {
							student.setFees(val);
						}
						else
						if(cellCounter==4) {
							student.setPendingFees(val);
						}
						else
							if(cellCounter==5) {
								if(HSSFDateUtil.isCellDateFormatted(currentCell)) {
									
									Date d = currentCell.getDateCellValue();
									student.setDueDate(d);
								}
//								System.out.println("DATE is "+val);
//								Date d = new Date((long)val);
//								System.out.println("Now Date is "+d);
								
							}
					System.out.print("Numeric Cell is "+currentCell.getNumericCellValue());
				}
				cellCounter++;
			} // Cell Loop Ends
			System.out.println();
			students.add(student);
		} // Row Loop Ends
		workBook.close();
		fs.close();
		return students;
		
	}

}

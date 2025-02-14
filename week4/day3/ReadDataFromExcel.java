package week4.day3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public  static String[][] ReadTestData(String filename) throws IOException {
		
		//open the workbook
		XSSFWorkbook workbook =new  XSSFWorkbook("./TestData/"+filename+".xlsx");//pass workbook path as argument
		//Open Worksheet
		XSSFSheet worksheet = workbook.getSheetAt(0);
		//To count the number of rows - without header
				int rowCount = worksheet.getLastRowNum();
				System.out.println("Row count is : "+rowCount);
				
				//To count the number of rows - with header
				int physicalNumberOfRows = worksheet.getPhysicalNumberOfRows();
				System.out.println(physicalNumberOfRows);
				
				
				//To count the number of columns
				int columnCount = worksheet.getRow(1).getLastCellNum();
				System.out.println("Column count is: "+columnCount);
				//To retrieve a particular value in a cell
				String row1column1Data = worksheet.getRow(1).getCell(0).getStringCellValue();
				System.out.println(row1column1Data);
				//to retrive all data
				//Declare 2D String Array
				String[][] data=new String[rowCount][columnCount];
				for (int i = 1; i <= rowCount; i++) { //row starts with index 1
					XSSFRow row = worksheet.getRow(i);
					for (int j = 0; j < columnCount; j++) {
						String allData = row.getCell(j).getStringCellValue();
						data[i-1][j]=allData;
						//  data[0][0]  ="keerthana" 
						//  data[1] [0] ="kikie"	
							                
				

	}
					
					

}
				workbook.close();
				return data;
	}
}

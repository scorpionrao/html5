package headfirst.workbook;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class test {

	public static void main(String[] args) throws BiffException, IOException {
		
		File employeesWB = new File ("//Users//rgonugunta//Desktop//employees.xls");
		Workbook wb = Workbook.getWorkbook(employeesWB);
		/*Sheet sht1 = wb.getSheet("Sheet2");
		Cell cl1 = sht1.getCell(2, 4);
		System.out.println(cl1.getContents());
		Cell cl1 = sht1.findCell("Anusha");
		System.out.println("Row = "+ cl1.getRow());
		System.out.println("Column = " + cl1.getColumn());*/
		
		Sheet itEmployees =  wb.getSheet("IT_Employees");
		
		Cell startTable = itEmployees.findCell("StartTable");
		int startRow = startTable.getRow();
		int startCol = startTable.getColumn();
		System.out.println("Start Table Info : Row = " +
				startRow + " Col = " + startCol );
	
		Cell endTable = itEmployees.findCell("EndTable");	
		int endRow = endTable.getRow();
		int endCol = endTable.getColumn();
		System.out.println("End Table Info : Row = " +
				endRow + " Col = " + endCol );
		
		String[][] testData = new String [endRow-startRow-1][endCol-startCol-1];
		
		for(int row=startRow+1;row<=endRow-1;row++){
			for(int col=startCol;col<=endCol;col++) {
				System.out.print( "\t" +itEmployees.getCell(col, row).getContents() );
			}
			System.out.println();
		}
		
	}

}
package extra.excel.basic;

import java.io.FileOutputStream;
import java.io.OutputStream;

import lombok.Cleanup;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteXls {
	
	public static void main(String[] args) throws Exception  {
		
		@Cleanup OutputStream out = new FileOutputStream("src/extra/excel/data/demo-1.xls");
		
		HSSFWorkbook wb = new HSSFWorkbook();
		
		HSSFSheet sheet = wb.createSheet("sheet-1");
		
		HSSFRow row_title = sheet.createRow(0);
		
		HSSFCell row_title_cell0 = row_title.createCell(0);
		row_title_cell0.setCellValue("Name");
		HSSFCell row_title_cell1 = row_title.createCell(1);
		row_title_cell1.setCellValue("Age");
		HSSFCell row_title_cell2 = row_title.createCell(2);
		row_title_cell2.setCellValue("Detail");
		
		for (int i = 1 ; i <= 3 ; i++) {
			HSSFRow row = sheet.createRow(i);

			for (int j = 0; j < 3; j++) {
				HSSFCell cell = row.createCell(j);
				if(j==0) {
					cell.setCellValue(j);
				} else {
					cell.setCellValue(i + "-" + j);
				}
			}
		}
		
		
		wb.write(out);
		
		
	}

}

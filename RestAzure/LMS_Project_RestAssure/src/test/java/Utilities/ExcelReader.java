package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelReader {

	@DataProvider(name = "createData")
	public Object[][] createData() throws IOException {

		return getExcelData("src/test/resources/ExcelData.xlsx", "create_data");
	}

	@DataProvider(name = "updateData")
	public Object[][] updateData() throws IOException {

		return getExcelData("src/test/resources/ExcelData.xlsx", "update_data");
	}

	private Object[][] getExcelData(String file, String sheet) {

		String[][] data = null;

		try {
			FileInputStream fis = new FileInputStream(file);

			XSSFWorkbook workbook = new XSSFWorkbook(fis);

			XSSFSheet worksheet = workbook.getSheet(sheet);

			XSSFRow row = worksheet.getRow(0);

			int rowCount = worksheet.getPhysicalNumberOfRows();
			int colCount = row.getLastCellNum();

			data = new String[rowCount - 1][colCount];

			DataFormatter formatter = new DataFormatter();

			for (int i = 1; i < rowCount; i++) {

				row = worksheet.getRow(i);

				for (int j = 0; j < colCount; j++) {

					Cell cell = row.getCell(j);

					data[i - 1][j] = formatter.formatCellValue(cell);
				}
			}

			workbook.close();
			fis.close();

		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}

		return data;
	}
}
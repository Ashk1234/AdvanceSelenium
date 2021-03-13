package Demo;

import java.io.FileInputStream;




import java.io.FileOutputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Excelutility {


	
	
		public String Testcase;
		public FileOutputStream testoutput;
		public WritableSheet writablesh; 
		public WritableWorkbook workbookcopy;
		public Sheet sheets;
		public Workbook wbook;
		public FileInputStream testfile;

		@BeforeClass
		public void queryParameterization() throws BiffException,IOException,RowsExceededException,WriteException, InterruptedException{

		 testfile = new FileInputStream("C:\\Users\\ashk1234\\Desktop\\Framework\\Test Scripts\\DeepikaWebDriver\\src\\Testdata\\TestData.xls");//Now get 
		 wbook = Workbook.getWorkbook(testfile);
		//Now get Workbook 
		 sheets = wbook.getSheet("Query_data");
		int Norows = sheets.getRows();
		//Read rows and columns and save it in String Two dimensional array
		String inputdata[][] = new String[sheets.getRows()][sheets.getColumns()];
		System.out.println("Number of rows present in TestData xls file is -"+Norows);
		//For writing the data into excel we will use 
		 testoutput = new FileOutputStream("C:\\Users\\ashk1234\\Desktop\\Framework\\Test Scripts\\DeepikaWebDriver\\src\\Testdata\\TestData_results.xls");
		System.out.println("creating file one");
		//To Create writable workbook
		workbookcopy = Workbook.createWorkbook(testoutput);
		System.out.println("creating file 2");
		//To Create Writable sheet in Writable workbook
		writablesh = workbookcopy.createSheet("Query_data",0);
		System.out.println("creating file 3");

		//Using for loop to write all the data to new sheet 
		for(int i=0;i<sheets.getRows();i++) { 
		for(int k=0;k<sheets.getColumns();k++) {
		 inputdata[i][k] = sheets.getCell(k, i).getContents(); 
		Label l = new Label(k, i, inputdata[i][k]); 
		Label l2 = new Label(4,0,"Results"); 
		writablesh.addCell(l); 
		writablesh.addCell(l2); 

		            }

		        }

		}


		@AfterClass
		public void writeexcels(){ 
		try { 
		workbookcopy.write(); 
		} catch (IOException e) { 
		e.printStackTrace(); 
		} 

		try { 
		workbookcopy.close(); 
		} catch (WriteException e) { 
		e.printStackTrace(); 
		} catch (IOException e) { 
		e.printStackTrace(); 
		     } 

		  }

		}

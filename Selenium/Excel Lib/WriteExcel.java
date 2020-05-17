

import java.io.File;

import java.io.*;
import java.util.*;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFCell;


class WriteExcel {
/*  
	   public static void read()
	   {
		  
		   short a=1;  
		    short b=1;  
		   
		   
		        String   value1="", value2="";  
		        
		       String filename ="C:/Rahul's Docs/AUTOMATION FILES/ExportExcel/data.xls";     
		        
		       
		       if(filename != null && !filename.equals("")){
		       
		    	   try
		    	   {
					        FileInputStream fs =new FileInputStream(filename);    
					        HSSFWorkbook wb = new HSSFWorkbook(fs);   
					        System.out.println(wb.getNumberOfSheets());
					       
					        
					        HSSFSheet sheet = wb.getSheetAt(0);
					        int rows  = sheet.getPhysicalNumberOfRows();    
					         
					         System.out.println(rows);
					         for(int r =     1; r < rows; r++)
					         {    		         
					        	 HSSFRow row   = sheet.getRow(r);
					        	 int cells = row.getPhysicalNumberOfCells();    
					        	 
						         System.out.println(cells);
							     
					        	 HSSFCell cell1  = row.getCell(a);      
					             value1 = cell1.getStringCellValue();   
					            
					            System.out.println(value1);
							    
					            
					            HSSFCell cell2  = row.getCell(b);     
					            value2 = cell2.getStringCellValue();    
			   
					            a = (short) (a+1);
					            b=(short) (b+1);
					            
					          } 
		    	   	}
		    	   catch(Exception e)
		    	   {
		    	   
		    	   }

		       }
	   }
	*/
	
	 public static void main(String[]args){
		 try{
			 
			 //read();
			 
			 	String filename = "C:/Rahul's Docs/AUTOMATION FILES/ExportExcel/hello.xls" ;
		        FileInputStream fs =new FileInputStream(filename);    
		        HSSFWorkbook hwb = new HSSFWorkbook(fs);
		        
		 //String filename="C:/Rahul's Docs/AUTOMATION FILES/ExportExcel/hello.xls" ;
		 //HSSFWorkbook hwb=new HSSFWorkbook();
		 HSSFSheet sheet =  hwb.getSheetAt(0);

		 /*
		 HSSFRow rowhead=   sheet.createRow((short)0);
		 rowhead.createCell((short) 0).setCellValue("SNo");
		 rowhead.createCell((short) 1).setCellValue("First Name");
		 rowhead.createCell((short) 2).setCellValue("Last Name");
		 rowhead.createCell((short) 3).setCellValue("Username");
		 rowhead.createCell((short) 4).setCellValue("E-mail");
		 rowhead.createCell((short) 5).setCellValue("Country");
		*/
		 
		 HSSFRow row=   sheet.createRow((short)4);
		 //row.createCell((short) 0).setCellValue("1");
		 //row.createCell((short) 1).setCellValue("Rose");
		 //row.createCell((short) 2).setCellValue("India");
		 //row.createCell((short) 3).setCellValue("roseindia");
		 //row.createCell((short) 4).setCellValue("hello@roseindia.net");
		 row.createCell((short) 6).setCellValue("test");

		 FileOutputStream fileOut =  new FileOutputStream(filename);
		 hwb.write(fileOut);
		 fileOut.close();
		 System.out.println("Your excel file has been generated!");

		 } catch ( Exception ex ) {
		     System.out.println(ex);
		 }
		 
		 }
	 

} 
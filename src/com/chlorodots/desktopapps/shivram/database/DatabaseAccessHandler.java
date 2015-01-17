/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chlorodots.desktopapps.shivram.database;

import com.chlorodots.desktopapps.shivram.io.Files;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
/**
 *
 * @author kdere
 */
public class DatabaseAccessHandler {
   public Employee employee;
   public Loan loan;
   String base_dir ;
   String Workbookname;
   WritableWorkbook workbook;
   
   public void createWorkBook() {
       Date obDate = new Date();
       SimpleDateFormat obDateFormat = new SimpleDateFormat("MM-YY");
       if (Files.isExists(base_dir)){
       try {
         workbook = Workbook.createWorkbook(new File(base_dir + obDateFormat.format(obDate.getTime())));
       } catch (IOException ex) {
           Logger.getLogger(DatabaseAccessHandler.class.getName()).log(Level.SEVERE, null, ex);
       } 
       } else {
//              workbook = Workbook.
       }
           
      
   }
   
   
   public DatabaseAccessHandler (){
        base_dir = "D:\\Books";
        Workbookname =  "";    
        
            createWorkBook();
   }
   
    /**
     * @return the employee
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * @param employee the employee to set
     */
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    /**
     * @return the loan
     */
    public Loan getLoan() {
        return loan;
    }

    /**
     * @param loan the loan to set
     */
    public void setLoan(Loan loan) {
        this.loan = loan;
    }
   
   
}

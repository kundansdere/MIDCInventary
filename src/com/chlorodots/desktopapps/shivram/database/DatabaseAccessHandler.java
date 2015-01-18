/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chlorodots.desktopapps.shivram.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kdere
 */
public class DatabaseAccessHandler {

    public Employee employee;
    public Loan loan;
    Statement statement;
    Connection con;
    ResultSet rs;

    public DatabaseAccessHandler() {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseAccessHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void openDatabse() {
        try {
            con = DriverManager.getConnection("jdbc:odbc:TestDB");
            statement = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseAccessHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void closeDatabse() {
        try {
            statement.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseAccessHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the employee
     */
    public Employee getEmployee() {
        try {
            String query = "select * from employee"; // Create Query
            statement.execute(query); // Execute Query 
            rs = statement.getResultSet(); //return the data from Statement into ResultSet
            while (rs.next()) // Retrieve data from ResultSet
            {
                employee.setEmp_id(rs.getInt(1)); //1st column of Table from database
                employee.setEmp_name(rs.getString(2)); //2nd column of Table 
                employee.setEmp_phone_number(rs.getString(3));
                employee.setEmp_address(rs.getString(4)); //3rd column of Table 
            }

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseAccessHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employee;
    }

    /**
     * @param employee the employee to set
     */
    public void setEmployee(Employee employee) {
        String emp_table = "employee";
        String addRow = "INSERT INTO " + emp_table + " (Emp_Name,Emp_Designation,Emp_Phone,Emp_Address)"
                + " VALUES ( '" + employee.emp_name + "',"
                + "'" + employee.emp_designation + "',"
                + "'" + employee.emp_phone_number + "',"
                + "'" + employee.emp_address + "')";
        try {
            statement.execute(addRow);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseAccessHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    public ArrayList getAllEmployees() {
        ArrayList empAll = new ArrayList();
        Employee emp = new Employee();
        String emp_table = "employee";
        String addRow = "SELECT * FROM " + emp_table + ";";
        try {
            statement.execute(addRow);
            ResultSet rs = statement.getResultSet();
            while ((rs != null) && (rs.next())) {
         
                emp.setEmp_id(rs.getInt(1));
                emp.setEmp_name(rs.getString(2));
                emp.setEmp_designation(rs.getString(3));
                emp.setEmp_phone_number(rs.getString(4));
                emp.setEmp_address(rs.getString(5));
                System.out.println(  "" + emp.emp_id);
                empAll.add(emp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseAccessHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return empAll;
    }
}

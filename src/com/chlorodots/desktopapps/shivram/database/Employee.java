/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chlorodots.desktopapps.shivram.database;

/**
 *
 * @author kdere
 */
public class Employee {
   public int emp_id;
   public String emp_name;
   public String emp_address;
   public String emp_phone_number;
   public String emp_designation;

    public Employee(int emp_id, String emp_name, String emp_address, String emp_phone_number) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_address = emp_address;
        this.emp_phone_number = emp_phone_number;
    }

    public Employee() {
    }

    /**
     * @return the emp_id
     */
    public int getEmp_id() {
        return emp_id;
    }

    /**
     * @param emp_id the emp_id to set
     */
    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    /**
     * @return the emp_name
     */
    public String getEmp_name() {
        return emp_name;
    }

    /**
     * @param emp_name the emp_name to set
     */
    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    /**
     * @return the emp_address
     */
    public String getEmp_address() {
        return emp_address;
    }

    /**
     * @param emp_address the emp_address to set
     */
    public void setEmp_address(String emp_address) {
        this.emp_address = emp_address;
    }

    /**
     * @return the emp_phone_number
     */
    public String getEmp_phone_number() {
        return emp_phone_number;
    }

    /**
     * @param emp_phone_number the emp_phone_number to set
     */
    public void setEmp_phone_number(String emp_phone_number) {
        this.emp_phone_number = emp_phone_number;
    }

    /**
     * @return the emp_designation
     */
    public String getEmp_designation() {
        return emp_designation;
    }

    /**
     * @param emp_designation the emp_designation to set
     */
    public void setEmp_designation(String emp_designation) {
        this.emp_designation = emp_designation;
    }
   
}

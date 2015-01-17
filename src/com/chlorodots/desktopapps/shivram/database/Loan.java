/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chlorodots.desktopapps.shivram.database;

/**
 *
 * @author kdere
 */
public class Loan {
    private int loan_id;
    private int emp_id;
    private int load_ammount;
    private String Remark;
    private int tenure;
    private String loan_sanction_date;

    public Loan() {
    }

    public Loan(int loan_id, int emp_id, int load_ammount, String Remark, int tenure, String loan_sanction_date) {
        this.loan_id = loan_id;
        this.emp_id = emp_id;
        this.load_ammount = load_ammount;
        this.Remark = Remark;
        this.tenure = tenure;
        this.loan_sanction_date = loan_sanction_date;
    }

    /**
     * @return the loan_id
     */
    private int getLoan_id() {
        return loan_id;
    }

    /**
     * @param loan_id the loan_id to set
     */
    private void setLoan_id(int loan_id) {
        this.loan_id = loan_id;
    }

    /**
     * @return the emp_id
     */
    private int getEmp_id() {
        return emp_id;
    }

    /**
     * @param emp_id the emp_id to set
     */
    private void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    /**
     * @return the load_ammount
     */
    private int getLoad_ammount() {
        return load_ammount;
    }

    /**
     * @param load_ammount the load_ammount to set
     */
    private void setLoad_ammount(int load_ammount) {
        this.load_ammount = load_ammount;
    }

    /**
     * @return the Remark
     */
    private String getRemark() {
        return Remark;
    }

    /**
     * @param Remark the Remark to set
     */
    private void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * @return the tenure
     */
    private int getTenure() {
        return tenure;
    }

    /**
     * @param tenure the tenure to set
     */
    private void setTenure(int tenure) {
        this.tenure = tenure;
    }

    /**
     * @return the loan_sanction_date
     */
    private String getLoan_sanction_date() {
        return loan_sanction_date;
    }

    /**
     * @param loan_sanction_date the loan_sanction_date to set
     */
    private void setLoan_sanction_date(String loan_sanction_date) {
        this.loan_sanction_date = loan_sanction_date;
    }
    
    
}

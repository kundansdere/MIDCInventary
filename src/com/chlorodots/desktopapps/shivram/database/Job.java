/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chlorodots.desktopapps.shivram.database;

/**
 *
 * @author kdere
 */
public abstract class Job {
    private int job_id = 0 ;
    private int challan_no = 0;
    private String date = "";
   
    /**
     * @return the job_id
     */
    public int getJob_id() {
        return job_id;
    }

    /**
     * @param job_id the job_id to set
     */
    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    /**
     * @return the challan_no
     */
    public int getChallan_no() {
        return challan_no;
    }

    /**
     * @param challan_no the challan_no to set
     */
    public void setChallan_no(int challan_no) {
        this.challan_no = challan_no;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chlorodots.desktopapps.shivram.database;

/**
 *
 * @author kdere
 */
public class Company {
    private String company_name;
    private String company_id;
    private String address;
    private int contact_number;

    public Company() {
    }


    public Company(String company_name, String company_id, String address, int contact_number) {
        this.company_name = company_name;
        this.company_id = company_id;
        this.address = address;
        this.contact_number = contact_number;
    }

    /**
     * @return the company_name
     */
    private String getCompany_name() {
        return company_name;
    }

    /**
     * @param company_name the company_name to set
     */
    private void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    /**
     * @return the company_id
     */
    private String getCompany_id() {
        return company_id;
    }

    /**
     * @param company_id the company_id to set
     */
    private void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    /**
     * @return the address
     */
    private String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    private void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the contact_number
     */
    private int getContact_number() {
        return contact_number;
    }

    /**
     * @param contact_number the contact_number to set
     */
    private void setContact_number(int contact_number) {
        this.contact_number = contact_number;
    }
    
    
}

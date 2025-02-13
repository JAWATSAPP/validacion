/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.struts1.register.action;

import com.mycompany.struts1.model.Person;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author FLHORIAN
 */
public class Register extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private Person personBean;

    public String execute() throws Exception {
        //call Service class to store personBean's state in database

        return SUCCESS;
    }

    public Person getPersonBean() {
        return personBean;
    }

    public void setPersonBean(Person person) {
        personBean = person;
    }

    public void validate() {
        if (personBean.getFirstName().length() == 0) {
            addFieldError("personBean.firstName", "First name is required.");
        }
        if (personBean.getLastName().length() == 0) {
            addFieldError("personBean.lastName", "Last name is required.");
        }

        if (personBean.getEmail().length() == 0) {
            addFieldError("personBean.email", "Email is required.");
        }

        if (personBean.getAge() < 18) {
            addFieldError("personBean.age", "Age is required and must be 18 or older");
        }
    }
}

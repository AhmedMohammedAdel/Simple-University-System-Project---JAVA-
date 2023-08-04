/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universityproject;

/**
 *
 * @author ahmed
 */
public abstract class person {

    private int id;
    private String Firstname;
    private String Lastname;
    private String address;
    private String telephone;
    private String Username;
    private String Password;
     private String dateOfbirth;

public person () {
    
}
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    
    
    public person(int id, String Firstname, String Lastname, String address, String telephone, String Username, String Password , String dateOfbirth) {
        this.id = id;
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.address = address;
        this.telephone = telephone;
        this.Username = Username;
        this.Password = Password;
        this.dateOfbirth = dateOfbirth ; 
    }

    public int Registration() {
        return 0;
    }

    public void addPhonenumber() {
        this.telephone = telephone;

    }

    public void addNewaddress() {
        this.address = address;
    }

}

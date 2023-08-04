/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universityproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ahmed
 */
public class instructor extends person implements payable {
    public ArrayList<department> departments = new ArrayList<>();
    public ArrayList<faculty> facultyset = new ArrayList <> () ;
    faculty Facultygrad ; 
    private int basicSalary ; 
    private int EnrolledYear ; 
    public void setEnrolledYear(int EnrolledYear) {
        this.EnrolledYear = EnrolledYear;
    }

    public int getEnrolledYear() {
        return EnrolledYear;
    }
    
    public void setBasicSalary(int m ) {
       basicSalary = m ; 
    }
    public int getBasicSalary() {
      return basicSalary; 
    }

    public void setDepartments(ArrayList<department> departments) {
        this.departments = departments;
    }

    public void setFacultyset(ArrayList<faculty> facultyset) {
        this.facultyset = facultyset;
    }

    public void setFacultygrad(faculty Facultygrad) {
        this.Facultygrad = Facultygrad;
    }

    public instructor (String Firstname, int id, String Lastname, String address, String telephone, String Username, String Password, String dateOfbirth) {
             super (id,Firstname,Lastname,address,telephone,Username,Password,dateOfbirth) ;
    }
        public instructor (String Firstname, int id, String Lastname, String address, String telephone, String Username, String Password, String dateOfbirth , int basicSalary) {
             super (id,Firstname,Lastname,address,telephone,Username,Password,dateOfbirth) ;
    }

    public instructor(List<department> departments, int id, String Firstname, String Lastname, String address, String telephone, String Username, String Password , String dateOfbirth) {
        super(id, Firstname, Lastname, address, telephone, Username, Password , dateOfbirth);
        this.departments = (ArrayList<department>) departments;
    }

    public List<department> getDepartments() {
        return departments;
    }
    public List<faculty> getFacultites() {
        return facultyset;
    }
    public void setDepartments(List<department> departments) {
        this.departments = (ArrayList<department>) departments;
    }

    public void addDepartment(department d) {
        departments.add(d);
    }

    public void removeDepartment(department d) {
        departments.remove(d);
    }

    @Override
      public double payable() {
        return basicSalary;
    }
}

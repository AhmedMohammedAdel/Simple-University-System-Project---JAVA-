/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universityproject;

import java.util.ArrayList;

/**
 *
 * @author ahmed
 */

 public class student extends person implements payable{

    private double enrolledYear;
    private double fees = 950;
    public ArrayList<course> Courses = new ArrayList<>();
    private faculty Faculty;
    private static int limitOfcourse;
    private double GPA;

    public ArrayList<course> getCourses() {
        return Courses;
    }

    public void setCourses(ArrayList<course> Courses) {
        this.Courses = Courses;
    }



    public void setGPA(double GPA) {
        this.GPA = GPA;
    }


    public double getGPA() {
        return GPA;
    }

    public double getEnrolledYear() {
        return enrolledYear;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public void setfaculyname(String s) {
        Faculty.setName(s);
    }

    public void setFaculty(faculty Faculty) {
        this.Faculty = Faculty;
    }

    public faculty getFaculty() {
        return Faculty;
    }

    public void setEnrolledYear(double enrolledYear) {
        this.enrolledYear = enrolledYear;
    }
//private departmnt
//private course

    double payfees(double enrolledYear) {
        this.enrolledYear = enrolledYear;
        return fees + (enrolledYear - 1) * 0.1;
    }

    public static int getLimitOfcourse() {
        return limitOfcourse;
    }

    public static void setLimitOfcourse(int limitOfcourse) {
        student.limitOfcourse = limitOfcourse;
    }

public student(String dateOfbirth, double enrolledYear, int id, String Firstname, String Lastname, String address, String telephone, String Username, String Password) {
    super(id, Firstname, Lastname, address, telephone, Username, Password, dateOfbirth);
    this.enrolledYear = enrolledYear;
}
    @Override
    public double payable() {
        double z = (enrolledYear - 2023) * 0.1 * fees + fees;
        return z;
    }
 }

// coures methods


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
public class course {

    /**
     *
     * @param courseCode
     * @param credit
     * @param Coursename
     */
    public course(int courseCode, int credit, String Coursename) {
        this.courseCode = courseCode;
        this.credit = credit;
        this.Coursename = Coursename;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public String getCoursename() {
        return Coursename;
    }

    public boolean isPass() {
        return pass;
    }

    public List<String> getStudents() {
        return students;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    


    private final int courseCode;
    private int credit;
    private double GPA ; 
     private String Coursename;
    private boolean pass;
    ArrayList <course> prerequist = new ArrayList <>() ;

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setCoursename(String Coursename) {
        this.Coursename = Coursename;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
    }

    public void setPrerequist(ArrayList<course> prerequist) {
        this.prerequist = prerequist;
    }

    public void setStudents(List<String> students) {
        this.students = students;
    }

    public ArrayList<course> getPrerequist() {
        return prerequist;
    }

    public int getCoursecode() {
        return courseCode;
    }

    public int getCredit() {
        return credit;
    }

    public course(int coursecode) {
        this.courseCode = coursecode;
    }
    List<String> students = new ArrayList<>();

    public void isPrerequisites(boolean prerequisites) {
        if (prerequisites == true) {
            if (pass == true) {
                System.out.print("you have access to next subject");
            } else {
                System.out.print("you have to repeat the subject");
            }
        }
    }

    public void enrollStudent(boolean enroll) {
        if (enroll == true) {
            students.add(person.class.getName());
        }
    }

    public void removeStudent(boolean remove) {
        if (remove == true) {
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).equals(person.class.getName())) {
                    students.remove(i);
                }
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universityproject;

import java.util.List;

/**
 *
 * @author ahmed
 */
public class adminstration extends person {

    private List<course> courses;
    private List<faculty> facultys;
    private List<instructor> instructors;
    private List<department> departments;
    private List<student> students;

    /*
    private int id;
    private String Firstname;
    private String Lastname;
    private String address;
    private String telephone;
    private String Username;
    private String Password;
*/
    
    public adminstration (int id, String Firstname, String Lastname, String address, String telephone, String Username, String Password, String dateOfbirth) {
             super (id,Firstname,Lastname,address,telephone,Username,Password,dateOfbirth) ;
  
    }
    
    public adminstration(int id, String Firstname, String Lastname, String address, String telephone, String Username, String Password , String dateOfbirth , List<course> courses, List<faculty> facultys, List<instructor> instructors, List<department> departments, List<student> students) {
        super (id,Firstname,Lastname,address,telephone,Username,Password,dateOfbirth) ;
        this.courses = courses;
        this.facultys = facultys;
        this.instructors = instructors;
        this.departments = departments;
        this.students = students;
    }

    public List<student> getStudents() {
        return students;
    }

    public void setStudents(List<student> students) {
        this.students = students;
    }

    public List<course> getCourses() {
        return courses;
    }

    public void setCourses(List<course> courses) {
        this.courses = courses;
    }

    public List<faculty> getFacultys() {
        return facultys;
    }

    public void setFacultys(List<faculty> facultys) {
        this.facultys = facultys;
    }

    public List<instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(List<instructor> instructors) {
        this.instructors = instructors;
    }

    public List<department> getDepartmints() {
        return departments;
    }

    public void setDepartmints(List<department> departmints) {
        this.departments = departmints;
    }

    public static void setLimit(student s) {
        student.setLimitOfcourse(6); // this value wil have been taken from textbox
    }

    public void addStudent(student s) {
        students.add(s);
    }

    public void removeStudent(student s) {
        students.remove(s);
    }

    public void addInstructor(instructor ins) {
        instructors.add(ins);
    }

    public void removeInstructor(instructor ins) {
        instructors.remove(ins);
    }

    public void addDepartment(department d) {
        departments.add(d);
    }

    public void removeDepartment(department d) {
        departments.remove(d);
    }

    public void addFaculty(faculty f) {
        facultys.add(f);
    }

    public void removeFaculty(faculty f) {
        facultys.remove(f);
    }

    public int NumOfStudent() {
        return students.size();
    }

    public int NumOfInstructor() {
        return instructors.size();
    }

    public int NumOfDpartment() {
        return departments.size();
    }

    public int NumOfFucultys() {
        return facultys.size();
    }

    public String ShowEveryThing() {
        return "courses : \n" + courses.toString() + "\n students :\n" + students.toString() + "\n" + "instructors : \n" + instructors.toString() + "\n facultys : \n" + facultys.toString() + "\n departments : \n" + departments.toString();
    }

}

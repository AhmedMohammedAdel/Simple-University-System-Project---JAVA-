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
public class department {

    private int id;

    public department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public department(int id, String name, ArrayList<faculty> facultys, ArrayList<course> courses) {
        this.id = id;
        this.name = name;
        this.facultys = facultys;
        this.courses = courses;
    }

    private String name;
    private ArrayList<faculty> facultys = new ArrayList <> ();
    private ArrayList<course> courses = new ArrayList <> () ;
    private ArrayList<student> Students = new ArrayList <> () ;

    public void setStudents(ArrayList<student> Students) {
        this.Students = Students;
    }

    public ArrayList<student> getStudents() {
        return Students;
    }

    public ArrayList<faculty> getFacultys() {
        return facultys;
    }

    public void setFacultys(ArrayList<faculty> facultys) {
        this.facultys = facultys;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<course> courses) {
        this.courses = courses;
    }

    public void addFaculty(faculty f) {
        facultys.add(f);
    }

    public void removeFaculty(faculty f) {
        facultys.remove(f);
    }

    public List<course> getDFepartmentCourses() {
        return courses;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universityproject;

/**
 *
 * @author ahmed
 */

public class arrays {
    public static student[] Students = new student[1000];
    public static adminstration[] admins = new adminstration[10];
    public static faculty[] fac = new faculty[50];
    public static department[] dep = new department[500];
    public static course[] courses = new course[500];
    public static instructor [] instructors = new instructor [500] ;
    public static classroom [] classrooms = new classroom [100] ;

    public static void setDep(department[] dep) {
        arrays.dep = dep;
    }

    public static void setClassrooms(classroom[] classrooms) {
        arrays.classrooms = classrooms;
    }

    public static department[] getDep() {
        return dep;
    }

    public static classroom[] getClassrooms() {
        return classrooms;
    }

    public static void setInstructors(instructor[] instructors) {
        arrays.instructors = instructors;
    }

    public static instructor[] getInstructors() {
        return instructors;
    }

    public static void setCourses(course[] courses) {
        arrays.courses = courses;
    }

    public static course[] getCourses() {
        return courses;
    }

    public static student[] getStudents() {
        return Students;
    }

    public static adminstration[] getAdmins() {
        return admins;
    }

    public static faculty[] getFac() {
        return fac;
    }

    public static void setStudents(student[] Students) {
        arrays.Students = Students;
    }

    public static void setAdmins(adminstration[] admins) {
        arrays.admins = admins;
    }

    public static void setFac(faculty[] fac) {
        arrays.fac = fac;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universityproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ahmed
 */
public class classroom {

    private int id;
    private String location;
    private int Capacity;
    List<course> courses = new ArrayList<>();
    private static Map<Integer, course> coursecheck = new HashMap<>();

    public List<course> getCourses() {
        return courses;
    }

    public classroom(int id, String location, int Capacity) {
        this.id = id;
        this.location = location;
        this.Capacity = Capacity;
    }

    public void setCourses(List<course> courses) {
        this.courses = courses;
    }

    public static void setCoursecheck(Map<Integer, course> coursecheck) {
        classroom.coursecheck = coursecheck;
    }


    classroom() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCapacity(int Capacity) {
        this.Capacity = Capacity;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public int getCapacity() {
        return Capacity;

    }

 /*   public boolean enrollcourse(course Course, period Period) {
        if (classroom.coursecheck.containsKey(Period.getPeriodnum())) {
            System.out.println("try another period or drop period first " + "Error 0X43244 in :- " + " Course Code : " + "" + Course.getCoursecode() + " - " + "period" + " " + Period.getPeriodnum() + " " + "in" + " " + Period.getDay());
            return false;
        } else {
            course Courses = Courses.getCoursecode();
            courses.add(course);

            classroom.coursecheck.put(Period.getPeriodnum(), Course);
            return true;
        }
    }
*/
    public boolean dropCourse(course Course, period Period) {

        if (!classroom.coursecheck.containsKey(Period.getPeriodnum())) {
            return false;
        } else {
            classroom.coursecheck.remove(Period.getPeriodnum());
            courses.remove(Integer.valueOf(Course.getCoursecode()));
            return true;

        }
    }

    public void displaycourses() {
        for (course str : courses) {
            System.out.println(str);
        }

    }
}

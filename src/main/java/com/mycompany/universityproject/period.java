/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universityproject;

/**
 *
 * @author ahmed
 */
public class period {

    private int periodnum;
    private String day;

    period(String day, int periodnum) {
        this.day = day;
        this.periodnum = periodnum;
    }

    public int getPeriodnum() {
        return periodnum;
    }

    public String getDay() {
        return day;
    }

    period() {

    }

    public void setPeriodnum(int periodnum) {
        this.periodnum = periodnum;
    }

    public void setDay(String day) {
        this.day = day;
    }

}

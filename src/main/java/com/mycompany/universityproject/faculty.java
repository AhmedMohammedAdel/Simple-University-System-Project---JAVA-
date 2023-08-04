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
public class faculty {

    public faculty(String name, String adress, int id, String email) {
        this.name = name;
        this.adress = adress;
        this.id = id;
        this.email = email;
    }
    
public faculty (){
    
}
    private String name;
    private String adress;
    private int id;
    private String email;
    private boolean add;
    private boolean remove;

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getDep() {
        return dep;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDep(List<String> dep) {
        this.dep = dep;
    }

    List<String> dep = new ArrayList<>();

    public void addDep(boolean add) {
        this.add = add;
        if (add == true) {
            dep.add(department.class.getName());
        }
    }

    public void removedep(boolean remove) {
        if (remove == true) {
            for (int i = 0; i < dep.size(); i++) {
                if (dep.get(i).equals(person.class.getName())) {
                    dep.remove(i);
                }
            }
        }
    }
}

package com.mycompany.universityproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
import GeneralJframes.Welcome_Page;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ahmed
 */
public class UniversityProject {

    public static void main(String[] args) {
        arrays d = new arrays();
        boolean student = false;
        boolean manager = false;
        boolean instructor = false;
        boolean courses = false;
        boolean classroom = false;
        boolean department = false;
        course c1 = null;
        course c2 = null;
        course c3 = null;
        course c4 = null;
        course c5 = null;
        course c6 = null;
        course c7 = null;
        course c8 = null;
        course c9 = null;
        course c10 = null;
        course c11 = null;
        course c12 = null;
        course c13 = null;
        course c14 = null;
        course c15 = null;
        course c16 = null;
        course c17 = null;
        course c18 = null;
        course c19 = null;
        course c20 = null;
        course c21 = null;
        course c22 = null;
        course c23 = null;
        course c24 = null;
        course c25 = null;
        course c26 = null;
        course c27 = null;
        course c28 = null;
        course c29 = null;
        course c30 = null;
        course c31 = null;
        course c32 = null;
        course c33 = null;
        course c34 = null;
        course c35 = null;
        course c36 = null;
        course c37 = null;
        course c38 = null;
        course c39 = null;
        course c40 = null;
        course c41 = null;
        course c42 = null;
        faculty f1 = null;
        faculty f2 = null;
        faculty f3 = null;
        faculty f4 = null;
        faculty f7 = null;
        faculty f8 = null;
        department d1 = null;
        department d2 = null;
        department d3 = null;
        department d4 = null;
        department d5 = null;
        department d6 = null;
        department d7 = null;
        department d8 = null;
        department d10 = null;
        department d9 = null;
        department d11 = null;
        department d12 = null;
        department d13 = null;
        department d14 = null;
        department d15 = null;
        student s1 = null;
        student s2 = null;
        student s3 = null;
        student s4 = null;
        student s5 = null;
        student s6 = null;
        student s7 = null;
        student s8 = null;
        student s9 = null;
        student s10 = null;
        student s11 = null;
        student s12 = null;

        Welcome_Page wel = new Welcome_Page();
        wel.setLocationRelativeTo(null);
        wel.setVisible(true);
        adminstration s;
        student stu = null;
        int index_fac = -1;
        for (int i = 0; i < arrays.fac.length; i++) {
            if (arrays.fac[i] == null) {
                index_fac = i;
                break;

            }
        }

        if (index_fac != -1) {
            f1 = new faculty("Faculty of Medicine", "123 Medical Street", 43223, "medicine@example.com");
            f2 = new faculty("Faculty of Science", "456 Science Avenue", 13131, "science@example.com");
            f3 = new faculty("Faculty of Engineering", "789 Engineering Road", 1314, "engineering@example.com");
            // Add more objects here

            f4 = new faculty("Faculty of Arts", "456 Arts Lane", 12313, "arts@example.com");
            f7 = new faculty("Faculty of Computer Science", "123 Computer Science Street", 1, "computerscience@example.com");
            f8 = new faculty("Faculty of Dentistry", "456 Dentistry Avenue", 2, "dentistry@example.com");
            arrays.fac[index_fac] = f1;
            arrays.fac[index_fac + 1] = f1;
            arrays.fac[index_fac + 2] = f2;
            arrays.fac[index_fac + 3] = f3;
            arrays.fac[index_fac + 4] = f4;
            arrays.fac[index_fac + 5] = f7;
            arrays.fac[index_fac + 6] = f8;

        }
        int index_courses = -1;
        for (int i = 0; i < arrays.courses.length; i++) {
            if (arrays.courses[i] == null) {
                index_courses = i;
                break;

            }
        }
        if (index_courses != -1) {
            c1 = new course(1001, 3, "English");
            c2 = new course(2002, 4, "Mathematics");
            c3 = new course(3003, 3, "History");
            c4 = new course(4800, 2, "Physics");
            c5 = new course(4900, 3, "Chemistry");
            c6 = new course(5000, 4, "Computer Science");
            c7 = new course(1001, 3, "Introduction to Computer Science");
            c8 = new course(1002, 4, "Data Structures and Algorithms");
            c9 = new course(1003, 3, "Computer Organization and Architecture");
            c10 = new course(2002, 4, "Calculus");
            c11 = new course(2003, 3, "World History");
            c12 = new course(1028, 3, "Artificial Intelligence");
            c13 = new course(1029, 4, "Database Systems");
            c14 = new course(3001, 3, "Anatomy");
            c15 = new course(3002, 4, "Physiology");
            c16 = new course(3003, 3, "Pathology");
            c17 = new course(3004, 4, "Pharmacology");
            c18 = new course(3005, 3, "Microbiology");
            c19 = new course(3006, 4, "Biochemistry");
            c20 = new course(3007, 3, "Immunology");
            c21 = new course(3008, 4, "Medical Ethics");
            c22 = new course(3009, 3, "Medical Genetics");
            c23 = new course(3010, 4, "Medical Imaging");
            c24 = new course(5001, 3, "Physics I");
            c25 = new course(5002, 4, "Chemistry I");
            c26 = new course(5003, 3, "Biology I");
            c27 = new course(5004, 4, "Mathematics I");
            c28 = new course(5005, 3, "Computer Science I");
            c29 = new course(5006, 4, "Environmental Science");
            c30 = new course(5008, 4, "Statistics");
            c31 = new course(5009, 3, "Astrophysics");
            c32 = new course(5010, 4, "Molecular Biology");
            c33 = new course(6001, 3, "Engineering Mathematics");
            c34 = new course(6002, 4, "Engineering Physics");
            c35 = new course(6003, 3, "Electrical Circuits");
            c36 = new course(6004, 4, "Mechanics of Materials");
            c37 = new course(6005, 3, "Introduction to Programming");
            c38 = new course(6006, 4, "Thermodynamics");
            c39 = new course(6007, 3, "Fluid Mechanics");
            c40 = new course(6008, 4, "Structural Analysis");
            c41 = new course(6009, 3, "Engineering Economics");
            c42 = new course(6010, 4, "Control Systems");
            arrays.courses[index_courses] = c1;
            arrays.courses[index_courses + 1] = c2;
            arrays.courses[index_courses + 2] = c3;
            arrays.courses[index_courses + 3] = c4;
            arrays.courses[index_courses + 4] = c5;
            arrays.courses[index_courses + 5] = c6;
            arrays.courses[index_courses + 6] = c7;
            arrays.courses[index_courses + 7] = c8;
            arrays.courses[index_courses + 8] = c9;
            arrays.courses[index_courses + 9] = c10;
            arrays.courses[index_courses + 10] = c11;
            arrays.courses[index_courses + 11] = c12;
            arrays.courses[index_courses + 12] = c13;
            arrays.courses[index_courses + 13] = c14;
            arrays.courses[index_courses + 14] = c15;
            arrays.courses[index_courses + 15] = c16;
            arrays.courses[index_courses + 16] = c17;
            arrays.courses[index_courses + 17] = c18;
            arrays.courses[index_courses + 18] = c19;
            arrays.courses[index_courses + 19] = c20;
            arrays.courses[index_courses + 20] = c21;
            arrays.courses[index_courses + 21] = c22;
            arrays.courses[index_courses + 22] = c23;
            arrays.courses[index_courses + 23] = c24;
            arrays.courses[index_courses + 24] = c25;
            arrays.courses[index_courses + 25] = c26;
            arrays.courses[index_courses + 26] = c27;
            arrays.courses[index_courses + 27] = c28;
            arrays.courses[index_courses + 28] = c29;
            arrays.courses[index_courses + 29] = c30;
            arrays.courses[index_courses + 30] = c31;
            arrays.courses[index_courses + 31] = c32;
            arrays.courses[index_courses + 32] = c33;
            arrays.courses[index_courses + 33] = c34;
            arrays.courses[index_courses + 34] = c35;
            arrays.courses[index_courses + 35] = c36;
            arrays.courses[index_courses + 36] = c37;
            arrays.courses[index_courses + 37] = c38;
            arrays.courses[index_courses + 38] = c39;
            arrays.courses[index_courses + 39] = c40;
            arrays.courses[index_courses + 40] = c41;
            arrays.courses[index_courses + 41] = c42;
            try {
                FileWriter coursess = new FileWriter("Courses.txt", true); // Append to the file
                BufferedWriter output = new BufferedWriter(coursess);
                output.write(c1.getCoursecode() + "\n");
                output.write(c2.getCoursecode() + "\n");
                output.write(c3.getCoursecode() + "\n");
                output.write(c4.getCoursecode() + "\n");
                output.write(c5.getCoursecode() + "\n");
                output.write(c6.getCoursecode() + "\n");
                output.write(c7.getCoursecode() + "\n");
                output.write(c8.getCoursecode() + "\n");
                output.write(c9.getCoursecode() + "\n");
                output.write(c10.getCoursecode() + "\n");
                output.write(c11.getCoursecode() + "\n");
                output.write(c12.getCoursecode() + "\n");
                output.write(c13.getCoursecode() + "\n");
                output.write(c14.getCoursecode() + "\n");
                output.write(c15.getCoursecode() + "\n");
                output.write(c16.getCoursecode() + "\n");
                output.write(c17.getCoursecode() + "\n");
                output.write(c18.getCoursecode() + "\n");
                output.write(c19.getCoursecode() + "\n");
                output.write(c20.getCoursecode() + "\n");
                output.write(c21.getCoursecode() + "\n");
                output.write(c22.getCoursecode() + "\n");
                output.write(c23.getCoursecode() + "\n");
                output.write(c24.getCoursecode() + "\n");
                output.write(c25.getCoursecode() + "\n");
                output.write(c26.getCoursecode() + "\n");
                output.write(c27.getCoursecode() + "\n");
                output.write(c28.getCoursecode() + "\n");
                output.write(c29.getCoursecode() + "\n");
                output.write(c30.getCoursecode() + "\n");
                output.write(c31.getCoursecode() + "\n");
                output.write(c32.getCoursecode() + "\n");
                output.write(c34.getCoursecode() + "\n");
                output.write(c33.getCoursecode() + "\n");
                output.write(c35.getCoursecode() + "\n");
                output.write(c36.getCoursecode() + "\n");
                output.write(c37.getCoursecode() + "\n");
                output.write(c38.getCoursecode() + "\n");
                output.write(c39.getCoursecode() + "\n");
                output.write(c40.getCoursecode() + "\n");
                output.close();
            } catch (IOException e) {

            }
        }

        int index_admin = -1;
        for (int i = 0; i < arrays.admins.length; i++) {
            if (arrays.admins[i] == null) {
                index_admin = i;
                break;

            }
        }
        if (index_admin != -1) {
            adminstration SS1 = new adminstration(1, " Ahmed", "Mohammed", "72MohammedGalalHammad", "01023896286", "AhmedMo200429", "1", "3112004");
            adminstration SS2 = new adminstration(445566, " Abdelrahman", "Ayman", "toson", "01023896286", "Bedo2004", "bedo6789", "3112004");
            adminstration SS3 = new adminstration(778899, " Ahmed", "Bekhit", "falaki", "01023896286", "Bekhit2004", "bekhit6789", "3112004");
            arrays.admins[index_admin] = SS1;
            arrays.admins[index_admin + 1] = SS2;
            arrays.admins[index_admin + 2] = SS3;
            try {
                FileWriter adminText = new FileWriter("admins.txt", true); // Append to the file
                BufferedWriter output = new BufferedWriter(adminText);
                output.write(SS1.getUsername() + "\n");
                output.write(SS2.getUsername() + "\n");
                output.write(SS3.getUsername() + "\n");

                output.close();
            } catch (IOException e) {

            }
        }

        int index_dep = -1;
        for (int i = 0; i < arrays.dep.length; i++) {
            if (arrays.dep[i] == null) {
                index_dep = i;
                break;

            }
        }
        if (index_dep != -1) {
            d1 = new department(123523, "Artificial Intelligence");
            d2 = new department(253541, "Data Science");
            d3 = new department(1452523, "Cybersecurity");
            d4 = new department(355351, "Orthodontics");
            d5 = new department(3523121, "Endodontics");
            d6 = new department(152574, "Dental Public Health");
            d7 = new department(25234251, "Mathematics");
            d8 = new department(3531431, "Environmental Science");
            d9 = new department(41411124, "English Literature");
            d10 = new department(4121132, "Fine Arts");
            d11 = new department(244562, "Pediatrics");
            d12 = new department(1213121, "Civil Engineering");
            d13 = new department(63667, "Computer Engineering");
            d14 = new department(6882413, "Obstetrics and Gynecology");
            d15 = new department(1323265, "Pathology");
            d1.getStudents().add(s9);
            d1.getStudents().add(s9);
            d1.getStudents().add(s9);
            d1.getStudents().add(s9);
            d1.getStudents().add(s9);
            d1.getStudents().add(s9);
            d1.getStudents().add(s9);
            d1.getStudents().add(s9);
            d1.getStudents().add(s9);
            d1.getStudents().add(s9);
            d1.getStudents().add(s9);
            d1.getStudents().add(s9);
            d1.getStudents().add(s9);
            d1.getStudents().add(s9);
            d1.getStudents().add(s9);
            d1.getStudents().add(s9);
            d1.getStudents().add(s9);
            try {
                FileWriter departments = new FileWriter("department.txt", true); // Append to the file
                BufferedWriter output = new BufferedWriter(departments);
                output.write(d1.getId() + "\n");
                output.write(d2.getId() + "\n");
                output.write(d3.getId() + "\n");
                output.write(d4.getId() + "\n");
                output.write(d5.getId() + "\n");
                output.write(d6.getId() + "\n");
                output.write(d7.getId() + "\n");
                output.write(d8.getId() + "\n");
                output.write(d9.getId() + "\n");
                output.write(d10.getId() + "\n");
                output.write(d11.getId() + "\n");
                output.write(d12.getId() + "\n");
                output.write(d13.getId() + "\n");
                output.write(d14.getId() + "\n");
                output.write(d15.getId() + "\n");

                output.close();
            } catch (IOException e) {

            }

            d1.getCourses().add(c9);
            d1.getCourses().add(c2);
            d1.getCourses().add(c1);
            d1.getCourses().add(c4);
            d1.getCourses().add(c2);
            d1.getCourses().add(c7);
            d1.getCourses().add(c14);
            d1.getCourses().add(c32);
            d1.getCourses().add(c21);
            d1.getCourses().add(c41);
            d1.getCourses().add(c31);
            d1.getCourses().add(c42);
            d1.getCourses().add(c11);
            d1.getCourses().add(c41);
            d1.getCourses().add(c25);
            d1.getCourses().add(c21);
            d1.getCourses().add(c22);
            d1.getCourses().add(c23);
            d1.getCourses().add(c29);
            d1.getCourses().add(c37);
            d1.getCourses().add(c38);

            arrays.dep[index_dep] = d1;
            arrays.dep[index_dep + 1] = d2;
            arrays.dep[index_dep + 2] = d3;
            arrays.dep[index_dep + 3] = d4;
            arrays.dep[index_dep + 4] = d5;
            arrays.dep[index_dep + 5] = d6;
            arrays.dep[index_dep + 6] = d7;
            arrays.dep[index_dep + 7] = d8;
            arrays.dep[index_dep + 8] = d9;
            arrays.dep[index_dep + 9] = d10;
            arrays.dep[index_dep + 10] = d11;
            arrays.dep[index_dep + 11] = d12;
            arrays.dep[index_dep + 12] = d13;
            arrays.dep[index_dep + 13] = d14;
            arrays.dep[index_dep + 14] = d15;
        }
        int index_classroom = -1;
        for (int i = 0; i < arrays.classrooms.length; i++) {
            if (arrays.classrooms[i] == null) {
                index_classroom = i;
                break;

            }
        }
        if (index_classroom != -1) {
            classroom S1 = new classroom(232142, "Building A, Room 102", 25);
            classroom S2 = new classroom(124143, "Building B, Room 201", 40);
            classroom S3 = new classroom(43454, "Building B, Room 202", 35);
            classroom S4 = new classroom(314155, "Building C, Room 301", 50);
            classroom S5 = new classroom(123136, "Building C, Room 302", 45);
            classroom S6 = new classroom(442417, "Building D, Room 401", 60);
            classroom S7 = new classroom(412418, "Building D, Room 402", 55);
            classroom S8 = new classroom(1451249, "Building E, Room 501", 70);
            classroom S9 = new classroom(131124110, "Building E, Room 502", 65);
            classroom S10 = new classroom(144541311, "Building F, Room 601", 80);
            classroom S11 = new classroom(4141412, "Building F, Room 602", 75);
            classroom S12 = new classroom(2414413, "Building G, Room 701", 90);
            classroom S13 = new classroom(1413214, "Building G, Room 702", 85);
            classroom S14 = new classroom(14131515, "Building H, Room 801", 100);
            classroom S15 = new classroom(2311131, "Building A, Room 101", 30);
            arrays.classrooms[index_classroom] = S1;
            arrays.classrooms[index_classroom + 1] = S2;
            arrays.classrooms[index_classroom + 2] = S3;
            arrays.classrooms[index_classroom + 3] = S4;
            arrays.classrooms[index_classroom + 4] = S5;
            arrays.classrooms[index_classroom + 5] = S6;
            arrays.classrooms[index_classroom + 6] = S7;
            arrays.classrooms[index_classroom + 7] = S8;
            arrays.classrooms[index_classroom + 8] = S9;
            arrays.classrooms[index_classroom + 9] = S10;
            arrays.classrooms[index_classroom + 10] = S11;
            arrays.classrooms[index_classroom + 11] = S12;
            arrays.classrooms[index_classroom + 12] = S13;
            arrays.classrooms[index_classroom + 13] = S14;
            arrays.classrooms[index_classroom + 14] = S15;

        }

        int index_ins = -1;
        for (int i = 0; i < arrays.instructors.length; i++) {
            if (arrays.instructors[i] == null) {
                index_ins = i;
                break;

            }
        }
        if (index_ins != -1) {
            instructor n1 = new instructor("1980-05-10", 3, "John", "Smith", "123 Main St", "1234567890", "3", "3");
            instructor n2 = new instructor("1975-08-15", 2, "Emily", "Johnson", "456 Oak Ave", "9876543210", "emilyjohnson", "2144");
            instructor n3 = new instructor("1982-03-22", 12112, "Michael", "Williams", "789 Elm Rd", "4567890123", "michaelwilliams", "1241");
            instructor n4 = new instructor("1978-12-03", 4, "Jessica", "Jones", "321 Pine Blvd", "0123456789", "jessicajones", "4123");
            instructor n5 = new instructor("1985-06-18", 5, "David", "Brown", "654 Cedar Ln", "9876543210", "davidbrown", "3525");
            instructor n6 = new instructor("1981-09-25", 6, "Sarah", "Davis", "987 Maple Ave", "1234567890", "sarahdavis", "3525");
            instructor n7 = new instructor("1979-02-12", 7, "Matthew", "Miller", "234 Oak St", "4567890123", "matthewmiller", "4214");
            instructor n8 = new instructor("1983-07-29", 8, "Jennifer", "Wilson", "567 Elm Rd", "0123456789", "jenniferwilson", "41223");
            instructor n9 = new instructor("1977-04-16", 9, "Christopher", "Anderson", "890 Pine Blvd", "9876543210", "christopheranderson", "1442");
            instructor n10 = new instructor("1984-11-23", 10, "Amy", "Thomas", "123 Cedar Ln", "1234567890", "amythomas", "341414");
            instructor n11 = new instructor("1980-08-12", 11, "Daniel", "Martinez", "456 Maple Ave", "4567890123", "danielmartinez", "12414");
            instructor n12 = new instructor("1976-01-29", 12, "Linda", "Taylor", "789 Oak St", "0123456789", "lindataylor", "4121");
            instructor n13 = new instructor("1983-06-06", 13, "Andrew", "Clark", "234 Elm Rd", "9876543210", "andrewclark", "142123");
            instructor n14 = new instructor("1979-09-13", 14, "Michelle", "Adams", "567 Pine Blvd", "1234567890", "michelleadams", "12441241");
            instructor n15 = new instructor("1985-02-20", 15, "Ryan", "Walker", "890 Cedar Ln", "4567890123", "ryanwalker", "3414122");

            n1.setFacultygrad(f8);
            n1.departments.add(d1);
            n1.departments.add(d2);
            n1.facultyset.add(f1);
            n1.facultyset.add(f2);
            n1.setBasicSalary(7000);
            n1.setEnrolledYear(2019);
            arrays.instructors[index_ins] = n1;
            arrays.instructors[index_ins + 1] = n2;
            arrays.instructors[index_ins + 2] = n3;
            arrays.instructors[index_ins + 3] = n4;
            arrays.instructors[index_ins + 4] = n5;
            arrays.instructors[index_ins + 5] = n6;
            arrays.instructors[index_ins + 6] = n7;
            arrays.instructors[index_ins + 7] = n8;
            arrays.instructors[index_ins + 8] = n9;
            arrays.instructors[index_ins + 9] = n10;
            arrays.instructors[index_ins + 10] = n11;
            arrays.instructors[index_ins + 11] = n12;
            arrays.instructors[index_ins + 12] = n13;
            arrays.instructors[index_ins + 13] = n14;
            arrays.instructors[index_ins + 14] = n15;
        try {
            FileWriter instructorss = new FileWriter("instructors.txt", true); // Append to the file
            try (BufferedWriter output = new BufferedWriter(instructorss)) {
                output.write(n1.getId() + "\n");
                output.write(n2.getId() + "\n");
                output.write(n3.getId() + "\n");
                output.write(n4.getId() + "\n");
                output.write(n5.getId() + "\n");
                output.write(n6.getId() + "\n");
                output.write(n7.getId() + "\n");
                output.write(n8.getId() + "\n");
                output.write(n9.getId() + "\n");
                output.write(n10.getId() + "\n");
                output.write(n11.getId() + "\n");
                output.write(n12.getId() + "\n");
                output.write(n13.getId() + "\n");
                output.write(n14.getId() + "\n");
                output.write(n15.getId() + "\n");

            }
        } catch (IOException e) {

        }

        }
        int index_stu = -1;
        for (int i = 0; i < arrays.Students.length; i++) {
            if (arrays.Students[i] == null) {
                index_stu = i;
                break;
            }
        }
        if (index_stu != -1) {
            s1 = new student("1999-05-10", 2018.0, 2, "John", "Doe", "123 Main St", "123-456-7890", "AhmedMo200429", "2");
            s2 = new student("1998-07-15", 2017.0, 2, "Jane", "Smith", "456 Elm St", "987-654-3210", "2", "2");
            s3 = new student("2000-02-25", 2019.0, 3511513, "Michael", "Johnson", "789 Oak St", "555-123-4567", "michaelj3", "password789");
            s4 = new student("1997-11-08", 2016.0, 151351354, "Emily", "Davis", "321 Pine St", "888-999-0000", "emilyd4", "passwordabc");
            s5 = new student("2001-09-03", 2020.0, 46262315, "David", "Wilson", "987 Cedar St", "111-222-3333", "davidw5", "passwordxyz");
            s6 = new student("1996-03-20", 2015.0, 14314136, "Sarah", "Anderson", "654 Birch St", "444-555-6666", "saraha6", "password123");
            s7 = new student("1999-08-18", 2018.0, 431537, "Robert", "Taylor", "789 Maple St", "777-888-9999", "robertt7", "password456");
            s8 = new student("2002-06-12", 2021.0, 14134138, "Jessica", "Thomas", "123 Oak St", "999-888-7777", "jessicat8", "password789");
            s9 = new student("1995-12-01", 2014.0, 355159, "Christopher", "Brown", "456 Pine St", "111-222-3333", "christopherb9", "passwordabc");
            s10 = new student("2000-10-05", 2019.0, 51351310, "Amanda", "Harris", "987 Elm St", "444-555-6666", "amandah10", "passwordxyz");
            s11 = new student("2001-10-05", 2022.0, 51315151, "Ahmed", "Mohammed", "123 Oak St", "424-545-6416", "ahmed200429", "passwordxyz");
            s12 = new student("1996-03-20", 2015.0, 14314136, "Sarah", "Anderson", "654 Birch St", "444-555-6666", "saraha6", "password123");

            s1.setFaculty(f1);
            s2.setFaculty(f2);
            s3.setFaculty(f4);
            s4.setFaculty(f3);
            s5.setFaculty(f8);
            s6.setFaculty(f4);
            s7.setFaculty(f7);
            s8.setFaculty(f2);
            s9.setFaculty(f1);
            s10.setFaculty(f8);
            s11.setFaculty(f3);
            s12.setFaculty(f4);
            s1.Courses.add(c9);

            s1.getCourses().add(c4);
            s1.getCourses().add(c3);
            s1.getCourses().add(c10);
            s1.getCourses().add(c14);
            s1.getCourses().add(c21);
            s1.getCourses().add(c13);
            s1.getCourses().add(c15);
            s1.getCourses().add(c17);
            s1.getCourses().add(c11);
            s1.getCourses().add(c12);
            s2.Courses.add(c9);
            arrays.Students[index_stu] = s1;
            arrays.Students[index_stu + 1] = s2;
            arrays.Students[index_stu + 2] = s3;
            arrays.Students[index_stu + 3] = s4;
            arrays.Students[index_stu + 4] = s5;
            arrays.Students[index_stu + 5] = s6;
            arrays.Students[index_stu + 6] = s7;
            arrays.Students[index_stu + 7] = s8;
            arrays.Students[index_stu + 8] = s9;
            arrays.Students[index_stu + 9] = s10;
            arrays.Students[index_stu + 10] = s11;
            arrays.Students[index_stu + 11] = s12;

        
        try {
            FileWriter studentss = new FileWriter("Student.txt", true); // Append to the file
            try (BufferedWriter output = new BufferedWriter(studentss)) {
                output.write(s1.getId() + "\n");
                output.write(s2.getId() + "\n");
                output.write(s3.getId() + "\n");
                output.write(s4.getId() + "\n");
                output.write(s5.getId() + "\n");
                output.write(s6.getId() + "\n");
                output.write(s7.getId() + "\n");
                output.write(s8.getId() + "\n");
                output.write(s9.getId() + "\n");
                output.write(s10.getId() + "\n");

            }
        } catch (IOException e) {

        }

    }

        // Creating a list of Payable objects
    }
}

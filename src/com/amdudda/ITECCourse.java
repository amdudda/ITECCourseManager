package com.amdudda;

import java.util.ArrayList;

/**
 * Created by amdudda on 9/30/2015.
 */
public class ITECCourse {

    // attributes of the ITECCourse object
    private String name;
    private int code;
    private ArrayList<String> students;
    private int maxStudents;

    //Constructor
    public ITECCourse(String courseName, int courseCode, int courseMaxStudents) {
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
    } // end Constructor for ITECCourse

    public String getName() {
        return this.name;
    }

    public void setName(String courseName) {
        this.name = courseName;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }


    public void addStudent(String studentName) {
        // make sure the class isn't already full before adding the student.
        if (this.getNumberOfStudents()<this.maxStudents) {
            students.add(studentName);
            System.out.println(studentName + " was added to " + this.name);
        } else {
            System.out.println(this.name + " is full.  Unable to enroll " + studentName + ".");
        } // end if-else
    } // end method addStudent

    public void writeCourseInfo() {
        System.out.println("Course Name: " + this.name);
        System.out.println("Course Code: " + this.code);
        System.out.println(this.getNumberOfStudents() + " students enrolled: ");
        for (String student : this.students) {
            System.out.println("\t" + student);
        } // end for
    } // end method writeCourseInfo

    public int getNumberOfStudents() {
        return this.students.size();
    } // end method getNumberOfStudents

    public void removeStudent(String studentName) {
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " has been un-enrolled from " + this.name);
        } else {
            System.out.println(studentName + " was not found in " + this.name);
        } // end if-else
    }  // end method removeStudent

} // end class ITECCourse

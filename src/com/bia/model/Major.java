package com.bia.model;

import java.util.ArrayList;
import java.util.List;

public class Major {

    private int id;
    private String className;
    private List<Student> students = new ArrayList<>();

    public Major(int id, String className, List<Student> students) {
        this.id = id;
        this.className = className;
        this.students = students;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Class{" +
                "classID=" + id +
                ", className='" + className + '\'' +
                '}';
    }
}

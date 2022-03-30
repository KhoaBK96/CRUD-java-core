package com.bia.model;

public class Student {

    private int id;
    private String name;
    private String phoneNumber;
    private int score;
    private Major major;

    public Student(int id, String name, String phoneNumber, int score, Major major) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.score = score;
        this.major = major;
    }

    public int getId() {
        return this.id;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", score=" + score +
                ", major=" + major +
                '}';
    }
}

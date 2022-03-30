package com.bia.controller;

import com.bia.Utility;
import com.bia.model.Major;
import com.bia.model.Student;
import com.bia.service.IMajorService;
import com.bia.service.IStudentService;

public class AddStudentController {

    private IStudentService studentService;

    private IMajorService majorService;

    public AddStudentController(IStudentService studentService, IMajorService majorService) {
        this.studentService = studentService;
        this.majorService = majorService;
    }

    public int addStudent(){

        System.out.println("Student ID: ");
        int id = Utility.getInt();

        if(studentService.getByID(id) == null) {

            System.out.println("Student name: ");
            String name = Utility.getString();

            System.out.println("Student phone number: ");
            String phoneNumber = Utility.getString();

            System.out.println("Student score: ");
            int score = Utility.getInt();


            System.out.println("Major ID: ");
            int majorID = Utility.getInt();
            Major major = majorService.getByID(majorID);

            Student newStudent = new Student(id, name, phoneNumber, score, major);

            studentService.add(newStudent);

            System.out.println("Add successfully");
        }else{
            System.out.println("Student already exist !!!!");
        }
        return 0;
    }
}

package com.bia.controller;

import com.bia.Utility;
import com.bia.model.Major;
import com.bia.model.Student;
import com.bia.service.IStudentService;

public class UpdateStudentController {

    private IStudentService studentService;

    public UpdateStudentController(IStudentService studentService) {
        this.studentService = studentService;
    }

    public int updateStudent(){
        System.out.println("Student ID:");
        int id = Utility.getInt();
        if (studentService.getByID(id) == null){
            System.out.println("Student doesn't exist!!");
        }else{

            System.out.println("Student name:");
            String name = Utility.getString();

            System.out.println("Student phone number:");
            String phoneNumber = Utility.getString();

            System.out.println("Student score:");
            int score = Utility.getInt();

            Major major = studentService.getByID(id).getMajor();

            Student newStudent = new Student(id,name,phoneNumber,score,major);

            studentService.update(newStudent);

            System.out.println("Update Successfully");
        }
        return 0;
    }
}

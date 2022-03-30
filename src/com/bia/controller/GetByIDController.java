package com.bia.controller;

import com.bia.Utility;
import com.bia.model.Student;
import com.bia.service.IStudentService;

public class GetByIDController {

    private IStudentService studentService;

    public GetByIDController(IStudentService studentService) {
        this.studentService = studentService;
    }

    public int getByID(){
        System.out.println("Student ID:");
        int id = Utility.getInt();
        Student student = studentService.getByID(id);
        if (student == null){
            System.out.println("Student doesn't exist!!");
        }else{
            System.out.println(student);
        }
        return 0;
    }
}

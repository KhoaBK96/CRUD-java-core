package com.bia.controller;

import com.bia.Utility;

import com.bia.model.Student;
import com.bia.service.IStudentService;

public class DeleteStudentController {

    private IStudentService studentService;

    public DeleteStudentController(IStudentService studentService) {
        this.studentService = studentService;
    }

    public int deleteStudent(){
        System.out.println("Student ID:");
        int id = Utility.getInt();
        Student student = studentService.getByID(id);
        if (student == null){
            System.out.println("Student doesn't exist!!");
        }else{
            studentService.delete(id);
            System.out.println("Delete successfully");
        }
        return 0;
    }
}

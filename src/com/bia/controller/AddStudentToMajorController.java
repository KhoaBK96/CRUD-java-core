package com.bia.controller;

import com.bia.Utility;
import com.bia.model.Major;
import com.bia.service.IMajorService;
import com.bia.service.IStudentService;

public class AddStudentToMajorController {

    private IStudentService studentService;

    private IMajorService majorService;

    public AddStudentToMajorController(IStudentService studentService, IMajorService majorService) {
        this.studentService = studentService;
        this.majorService = majorService;
    }

    public int addToMajor(){

        System.out.println("Major ID: ");
        int majorID = Utility.getInt();

        System.out.println("Student ID: ");
        int studentID = Utility.getInt();

        boolean a = majorService.addStudentToMajor(majorID, studentID);
        if(a == true){
            System.out.println("Add Successfully!!");
        }else{
            System.out.println("Add Failed!!");
        }
        return 0;
    }
}

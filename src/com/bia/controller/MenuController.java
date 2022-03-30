package com.bia.controller;

import com.bia.Utility;
import com.bia.service.IStudentService;

public class MenuController {

    private IStudentService studentService;

    public MenuController(IStudentService studentService) {
        this.studentService = studentService;
    }

    public int showMenu(){

        System.out.println("1.ShowAll\n" +
                "2.AddStudent\n" +
                "3.GetStudent\n" +
                "4.UpdateStudent\n" +
                "5.DeleteStudent\n" +
                "6.ShowAllMajor\n" +
                "7.AddMajor\n" +
                "8.AddStudentToClass\n" +
                "9.UpdateMajor\n" +
                "10.DeleteMajor\n");
        return Utility.getInt();
    }
}

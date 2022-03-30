package com.bia.controller;


import com.bia.model.Student;
import com.bia.service.IStudentService;

import java.util.List;


public class ListController {

    private IStudentService studentService;

    public ListController(IStudentService studentService) {
        this.studentService = studentService;
    }

    public int showAll(){
        System.out.println("Your student list:");
        List<Student> studentList = studentService.getAll();

        if (studentList == null || studentList.isEmpty()){
            System.out.println("List is empty");
        }else{
            for (int i = 0; i < studentList.size(); i++){
                System.out.println(studentList.get(i));
            }
        }
        return 0;
    }
}

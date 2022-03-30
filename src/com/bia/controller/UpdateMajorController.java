package com.bia.controller;

import com.bia.Utility;
import com.bia.model.Major;
import com.bia.model.Student;
import com.bia.service.IMajorService;

import java.util.List;

public class UpdateMajorController {

    IMajorService majorService;

    public UpdateMajorController(IMajorService majorService) {
        this.majorService = majorService;
    }

    public int updateMajor(){
        System.out.println("Major ID:");
        int id = Utility.getInt();
        if (majorService.getByID(id) == null){
            System.out.println("Major doesn't exist!!");
        }else{

            System.out.println("Major name:");
            String name = Utility.getString();

            List<Student> list = majorService.getByID(id).getStudents();

            Major newMajor = new Major(id,name,list);

            majorService.update(newMajor);

            System.out.println("Update Successfully");
        }
        return 0;
    }
}

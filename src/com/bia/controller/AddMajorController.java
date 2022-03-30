package com.bia.controller;

import com.bia.Utility;
import com.bia.model.Major;
import com.bia.model.Student;
import com.bia.service.IMajorService;

import java.util.ArrayList;
import java.util.List;

public class AddMajorController {

    IMajorService majorService;

    public AddMajorController(IMajorService majorService) {
        this.majorService = majorService;
    }

    public int addMajor(){

        System.out.println("Major ID: ");
        int majorID = Utility.getInt();

        if (majorService.getByID(majorID) == null) {

            System.out.println("Major name: ");
            String name = Utility.getString();

            List<Student> list = new ArrayList<>();

            Major newMajor = new Major(majorID, name, list);
            majorService.add(newMajor);

            System.out.println("Add Successfully");

        }else{
            System.out.println("Major already exist!!!");
        }
        return 0;
    }
}

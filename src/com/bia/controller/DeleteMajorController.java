package com.bia.controller;

import com.bia.Utility;
import com.bia.model.Major;
import com.bia.service.IMajorService;

public class DeleteMajorController {

    IMajorService majorService;

    public DeleteMajorController(IMajorService majorService) {
        this.majorService = majorService;
    }

    public int deleteMajor(){
        System.out.println("Major ID:");
        int id = Utility.getInt();
        Major major = majorService.getByID(id);
        if (major == null){
            System.out.println("Major doesn't exist!!");
        }else{
            majorService.delete(id);
            System.out.println("Delete successfully");
        }
        return 0;
    }

}

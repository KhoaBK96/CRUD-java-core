package com.bia.controller;

import com.bia.model.Major;
import com.bia.service.IMajorService;

import java.util.List;

public class MajorListController {

    IMajorService majorService;

    public MajorListController(IMajorService majorService) {
        this.majorService = majorService;
    }

    public int showAllMajor(){
        System.out.println("Your major list: ");
        List<Major> majorList = majorService.getAll();

        if (majorList == null || majorList.isEmpty()){
            System.out.println("List is empty");
        }else{
            for (int i = 0; i < majorList.size(); i++){
                System.out.println(majorList.get(i));
            }
        }
        return 0;
    }
}

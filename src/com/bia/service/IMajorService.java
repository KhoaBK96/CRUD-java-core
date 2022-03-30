package com.bia.service;

import com.bia.model.Major;


public interface IMajorService extends IService<Major> {

    boolean addStudentToMajor(int majorID, int studentID);
    boolean removeStudentFromMajor(int majorID, int studentID);
}

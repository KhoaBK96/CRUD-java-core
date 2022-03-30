package com.bia.service;

import com.bia.model.Student;

public interface IStudentService extends IService<Student> {

    int totalScore();
}

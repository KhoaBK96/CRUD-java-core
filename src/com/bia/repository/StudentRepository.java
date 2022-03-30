package com.bia.repository;

import com.bia.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {

    private static final List<Student> studentList = new ArrayList<>();

    @Override
    public boolean add(Student object){
        int addStudentID = object.getId();
        if (getByID(addStudentID) != null){
            return false;
        }
        studentList.add(object);
        return true;
    }

    @Override
    public List<Student> getAll(){
        return studentList;
    }

    @Override
    public Student getByID(int id){
        for (int i = 0; i < studentList.size(); i++){
            Student getStudent = studentList.get(i);
            if(getStudent.getId() == id){
                return getStudent;
            }
        }
        return null;
    }

    @Override
    public boolean update(Student object){
        int updateStudentID = object.getId();
        Student updateStudent = getByID(updateStudentID);
        if (updateStudent == null){
            return false;
        }
        updateStudent.setName(object.getName());
        updateStudent.setPhoneNumber(object.getPhoneNumber());
        updateStudent.setScore(object.getScore());
        updateStudent.setMajor(object.getMajor());
        return true;
    }

    @Override
    public boolean delete(int id){
        Student deleteStudent = getByID(id);
        if (deleteStudent == null){
            return false;
        }
        studentList.remove(deleteStudent);
        return true;
    }
}

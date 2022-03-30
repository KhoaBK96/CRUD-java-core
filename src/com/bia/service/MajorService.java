package com.bia.service;

import com.bia.model.Major;
import com.bia.model.Student;
import com.bia.repository.IMajorRepository;
import com.bia.repository.IStudentRepository;

import java.util.List;

public class MajorService implements IMajorService {

    IMajorRepository majorRepository;

    IStudentRepository studentRepository;

    public MajorService(IMajorRepository majorRepository, IStudentRepository studentRepository) {
        this.majorRepository = majorRepository;
        this.studentRepository = studentRepository;
    }

    @Override
    public boolean add(Major object) {
        return majorRepository.add(object);
    }

    @Override
    public List<Major> getAll() {
        return majorRepository.getAll();
    }

    @Override
    public Major getByID(int id) {
        return majorRepository.getByID(id);
    }

    @Override
    public boolean update(Major object) {
        return majorRepository.update(object);
    }

    @Override
    public boolean delete(int id) {
        return majorRepository.delete(id);
    }

    @Override
    public boolean addStudentToMajor(int majorID, int studentID) {
        Student newStudent = studentRepository.getByID(studentID);
        if(newStudent.getMajor().getId() == majorID){
            return false;
        }
        Major currentMajor = majorRepository.getByID(majorID);
        List<Student> students = currentMajor.getStudents();
        for (Student currentStudent : students) {
            if (currentStudent.getId() == newStudent.getId()) {
                return false;
            }
        }
        students.add(newStudent);
        newStudent.setMajor(currentMajor);
        return true;
    }

    @Override
    public boolean removeStudentFromMajor(int majorID, int studentID) {
        Student badStudent = studentRepository.getByID(studentID);
        if(badStudent.getMajor().getId() != majorID){
            return false;
        }
        Major currentMajor = majorRepository.getByID(majorID);
        List<Student> students = currentMajor.getStudents();
        boolean found = false;
        for (int i = 0; i < students.size(); i++){
            Student currentStudent = students.get(i);
            if (currentStudent.getId() == badStudent.getId()){
                found = true;
                break;
            }
        }

        if (!found) {
            return false;
        }
        students.remove(badStudent);
        return true;
    }
}

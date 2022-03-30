package com.bia.service;

import com.bia.model.Student;
import com.bia.repository.IStudentRepository;


import java.util.List;

public class StudentService implements IStudentService {

    private final IStudentRepository studentRepository;

    public StudentService(IStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public boolean add(Student object) {
        return studentRepository.add(object);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.getAll();
    }

    @Override
    public Student getByID(int id) {
        return studentRepository.getByID(id);
    }

    @Override
    public boolean update(Student student) {
        return studentRepository.update(student);
    }

    @Override
    public boolean delete(int id) {
        return studentRepository.delete(id);
    }

    @Override
    public int totalScore(){
        List<Student> scoreList = studentRepository.getAll();
        int totalScore = 0;
        for (int i=0; i < scoreList.size(); i++){
            totalScore += scoreList.get(i).getScore();
        }
        return totalScore;
    }
}

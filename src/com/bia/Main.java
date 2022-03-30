package com.bia;

import com.bia.controller.*;
import com.bia.repository.IMajorRepository;
import com.bia.repository.IStudentRepository;
import com.bia.repository.MajorRepository;
import com.bia.repository.StudentRepository;
import com.bia.service.IMajorService;
import com.bia.service.IStudentService;
import com.bia.service.MajorService;
import com.bia.service.StudentService;

public class Main {
    public static void main(String[] args) {

        IStudentRepository studentRepository = new StudentRepository();
        IMajorRepository majorRepository = new MajorRepository();
        IStudentService studentService = new StudentService(studentRepository);
        IMajorService majorService = new MajorService(majorRepository, studentRepository);

        MenuController menuController = new MenuController(studentService);
        ListController listController = new ListController(studentService);
        AddStudentController addStudentController = new AddStudentController(studentService, majorService);
        GetByIDController getByIDController = new GetByIDController(studentService);
        UpdateStudentController updateStudentController = new UpdateStudentController(studentService);
        DeleteStudentController deleteStudentController = new DeleteStudentController(studentService);

        MajorListController majorListController = new MajorListController(majorService);
        AddMajorController addMajorController = new AddMajorController(majorService);
        AddStudentToMajorController addStudentToMajorController = new AddStudentToMajorController(studentService, majorService);
        UpdateMajorController updateMajorController = new UpdateMajorController(majorService);
        DeleteMajorController deleteMajorController = new DeleteMajorController(majorService);

        int page = 0;
        boolean flag = true;
        while(flag){
            switch (page){
                case 0: {
                    page = menuController.showMenu();
                    break;
                }
                case 1: {
                    page = listController.showAll();
                    break;
                }
                case 2: {
                    page = addStudentController.addStudent();
                    break;
                }
                case 3: {
                    page = getByIDController.getByID();
                    break;
                }
                case 4: {
                    page = updateStudentController.updateStudent();
                    break;
                }
                case 5:{
                    page = deleteStudentController.deleteStudent();
                    break;
                }
                case 6:{
                    page = majorListController.showAllMajor();
                    break;
                }
                case 7:{
                    page = addMajorController.addMajor();
                    break;
                }
                case 8:{
                    page = addStudentToMajorController.addToMajor();
                    break;
                }
                case 9:{
                    page = updateMajorController.updateMajor();
                    break;
                }
                case 10:{
                    page = deleteMajorController.deleteMajor();
                    break;
                }
                default: {
                    flag = false;
                }
            }
        }
    }
}

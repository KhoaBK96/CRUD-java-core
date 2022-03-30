package com.bia.repository;

import java.util.ArrayList;
import java.util.List;
import com.bia.model.Major;

public class MajorRepository implements IMajorRepository {

    private static final List<Major> MAJOR_LIST = new ArrayList<>();

    @Override
    public boolean add(Major object) {
        int addClassID = object.getId();
        if (getByID(addClassID) != null){
            return false;
        }
        MAJOR_LIST.add(object);
        return true;
    }

    @Override
    public List<Major> getAll() {
        return MAJOR_LIST;
    }

    @Override
    public Major getByID(int id) {
        for (int i = 0; i < MAJOR_LIST.size(); i++){
            Major getMajor = MAJOR_LIST.get(i);
            if(getMajor.getId() == id){
                return getMajor;
            }
        }
        return null;
    }

    @Override
    public boolean update(Major object) {
        int updateClassID = object.getId();
        Major updateMajor = getByID(updateClassID);
        if (updateMajor == null){
            return false;
        }
        updateMajor.setId(object.getId());
        updateMajor.setClassName(object.getClassName());
        return true;
    }

    @Override
    public boolean delete(int id) {
        Major deleteMajor = getByID(id);
        if (deleteMajor == null){
            return false;
        }
        MAJOR_LIST.remove(deleteMajor);
        return true;
    }
}

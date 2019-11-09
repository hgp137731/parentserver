package com.provider.dao;

import com.provider.entity.Student;

import java.util.Collection;

/**
 * @author guangpeng he on 2019/11/3
 */
public interface StudentDao {
    Collection<Student> findAll();
    Student findById(long id);
    void saveOrUpdate(Student student);
    void deleteById(long id);
}

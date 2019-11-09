package com.provider.dao.impl;

import com.provider.dao.StudentDao;
import com.provider.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author guangpeng he on 2019/11/3
 */
@Repository
public class StudentDaoImpl implements StudentDao {
    private static Map<Long,Student> studentMap ;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1L,new Student(1L,"张三",12));
        studentMap.put(2L,new Student(2L,"李四",13));
        studentMap.put(3L,new Student(3L,"王五",14));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
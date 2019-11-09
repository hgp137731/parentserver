package com.provider.controller;

import com.provider.dao.StudentDao;
import com.provider.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author guangpeng he on 2019/11/3
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentDao.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return studentDao.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentDao.saveOrUpdate(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentDao.saveOrUpdate(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        studentDao.deleteById(id);
    }

    @GetMapping("/index")
    public String index(){
        return "当前端口" + this.port;
    }

}
package com.feign.controller;

import com.feign.entity.Student;
import com.feign.feignservice.FeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @author guangpeng he on 2019/11/4
 */
@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private FeignClientService feignClientService;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignClientService.findAll();
    }

    @GetMapping("/index")
    public String index(){
        return feignClientService.index();
    }
}
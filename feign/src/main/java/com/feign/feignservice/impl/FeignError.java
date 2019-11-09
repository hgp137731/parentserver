package com.feign.feignservice.impl;

import com.feign.entity.Student;
import com.feign.feignservice.FeignClientService;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author guangpeng he on 2019/11/4
 */
@Component
public class FeignError implements FeignClientService {

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "系统维护中.......";
    }
}
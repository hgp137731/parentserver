package com.feign.feignservice;

import com.feign.entity.Student;
import com.feign.feignservice.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author guangpeng he on 2019/11/4
 */
@FeignClient(value = "provider" ,fallback = FeignError.class)
public interface FeignClientService {

    @GetMapping("/student/findAll")
    Collection<Student> findAll();

    @GetMapping("/student/index")
    String index();
}

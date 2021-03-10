package com.southwind.feign;

import com.southwind.entity.Student;
import com.southwind.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

//@FeignClient(value = "provider", fallback = FeignError.class)
@FeignClient(value = "provider")
public interface FeignProviderClient {
    @GetMapping("/student/findAll")  //访问/provider/student/findAll
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}
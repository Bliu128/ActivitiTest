package com.example.activiti.Collection;

import com.example.activiti.dto.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.activiti.service.ActivitiService;

@RestController
@RequestMapping(("/activiti"))
public class ActivitiCollection {
    @Autowired
    ActivitiService activitiService;

    @PostMapping("/test")
    public void test(@RequestBody Task task) {
        activitiService.test();
    }


}
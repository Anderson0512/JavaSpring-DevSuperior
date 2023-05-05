package com.devsuperior.home.controller;

import com.devsuperior.home.entities.Department;
import com.devsuperior.home.model.dto.DepartmentResponseDTO;
import com.devsuperior.home.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public DepartmentResponseDTO getDepartment(){
        return departmentService.getDepartments();
    }

    @PostMapping
    public Department save(@RequestBody Department department){
        return departmentService.create(department);
    }
}

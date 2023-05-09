package com.devsuperior.home.controller;

import com.devsuperior.home.entities.Department;
import com.devsuperior.home.model.dto.DepartmentResponseDTO;
import com.devsuperior.home.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public Department getById(@PathVariable Long id){
        return departmentService.getById(id);
    }

    @PutMapping("/{id}")
    public Department putById(@PathVariable Long id, @RequestParam String name){
        return departmentService.putById(id, name);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.MULTI_STATUS)
    public String deleteById(@PathVariable Long id){
        departmentService.deleteById(id);
        return ResponseEntity.status(204).body("Dados apagados do id " + id).getBody();
    }
}

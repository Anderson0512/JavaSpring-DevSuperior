package com.devsuperior.home.service;

import com.devsuperior.home.entities.Department;
import com.devsuperior.home.model.dto.DepartmentResponseDTO;
import com.devsuperior.home.model.mapper.DepartmentResponseMapper;
import com.devsuperior.home.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public DepartmentResponseDTO getDepartments() {

        return new DepartmentResponseMapper(departmentRepository.findAll()).getResponseDTO();
    }

    @Override
    public Department create(Department name) {
        return departmentRepository.save(name);
    }

    @Override
    public Department getById(Long id) {
        return departmentRepository.findById(id).orElseThrow();
    }

    @Override
    public Department putById(Long id, String name) {
        Department dp = departmentRepository.findById(id).orElseThrow();
        dp.setName(name);
        return departmentRepository.save(dp);
    }

    @Override
    public void deleteById(Long id) {
        departmentRepository.delete(departmentRepository.findById(id).orElseThrow());
    }
}

package com.devsuperior.home.service;

import com.devsuperior.home.entities.Department;
import com.devsuperior.home.model.dto.DepartmentResponseDTO;
import com.devsuperior.home.model.mapper.DepartmentResponseMapper;
import com.devsuperior.home.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
}

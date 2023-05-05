package com.devsuperior.home.service;

import com.devsuperior.home.entities.Department;
import com.devsuperior.home.model.dto.DepartmentResponseDTO;

public interface DepartmentService {
    DepartmentResponseDTO getDepartments();
    Department create(Department name);
}

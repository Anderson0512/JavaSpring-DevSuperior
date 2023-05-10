package com.devsuperior.home.model.mapper;

import com.devsuperior.home.entities.Department;
import com.devsuperior.home.model.dto.DepartmentResponseDTO;

import java.util.ArrayList;
import java.util.List;

public class DepartmentResponseMapper {

    private final DepartmentResponseDTO responseDTO = new DepartmentResponseDTO();

    public DepartmentResponseMapper(List<Department> list){

        List<Department> content = new ArrayList<>();

        for (Department department : list){

            Department dp = new Department();
            dp.setId(department.getId());
            dp.setName(department.getName());

            content.add(dp);
        }
        responseDTO.setContent(content);
        responseDTO.setValuesPageable(content);
    }

    public DepartmentResponseDTO getResponseDTO() {
        return responseDTO;
    }
}

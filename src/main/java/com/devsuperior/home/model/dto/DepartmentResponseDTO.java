package com.devsuperior.home.model.dto;

import com.devsuperior.home.entities.Department;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DepartmentResponseDTO {
    @JsonProperty("_content")
    private List<Department> content;
}

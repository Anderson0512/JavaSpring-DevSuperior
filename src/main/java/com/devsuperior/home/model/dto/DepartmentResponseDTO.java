package com.devsuperior.home.model.dto;

import com.devsuperior.home.entities.Department;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class DepartmentResponseDTO extends BaseListBFFResponse implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @JsonProperty("_content")
    private transient List<Department> content;
}

package com.devsuperior.home.model.dto;

import com.devsuperior.home.model.vo.ProductVO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProductListDTO {

    @JsonProperty("_content")
    private List<ProductVO> productVOList;
}

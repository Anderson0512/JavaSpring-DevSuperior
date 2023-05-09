package com.devsuperior.home.model.mapper;

import com.devsuperior.home.entities.Department;
import com.devsuperior.home.entities.Product;
import com.devsuperior.home.model.dto.ProductRequestDTO;

public class ProductRequestUpdateMapper {

    public ProductRequestUpdateMapper(){}
    public Product getProduct(ProductRequestDTO requestDTO, Department department,Product upProduct) {
        var price = Double.valueOf(requestDTO.getPrice().replace(',','.'));

        upProduct.setName(requestDTO.getName());
        upProduct.setPrice(price);
        upProduct.setDepartment(department);
        return upProduct;
    }
}

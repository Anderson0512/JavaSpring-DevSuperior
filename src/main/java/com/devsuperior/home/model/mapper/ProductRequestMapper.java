package com.devsuperior.home.model.mapper;

import com.devsuperior.home.entities.Department;
import com.devsuperior.home.entities.Product;
import com.devsuperior.home.model.dto.ProductRequestDTO;

public class ProductRequestMapper {

    private final Product product = new Product();

    public ProductRequestMapper(ProductRequestDTO productRequestDTO, Department dp){

        Double price = Double.valueOf(productRequestDTO.getPrice().replace(',','.'));

        product.setName(productRequestDTO.getName());
        product.setPrice(price);
        product.setDepartment(dp);
    }

    public Product getProduct() {
        return product;
    }
}

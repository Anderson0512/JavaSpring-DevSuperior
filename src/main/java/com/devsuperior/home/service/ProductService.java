package com.devsuperior.home.service;

import com.devsuperior.home.model.dto.ProductListDTO;
import com.devsuperior.home.model.dto.ProductRequestDTO;
import com.devsuperior.home.model.vo.ProductVO;

public interface ProductService {

    ProductVO saveProduct(ProductRequestDTO requestDTO);
    ProductVO updateProduct(Long id, ProductRequestDTO requestDTO);
    ProductListDTO getListProduct();
    ProductVO getProduct(Long id);
    void deleteById(Long id);

}

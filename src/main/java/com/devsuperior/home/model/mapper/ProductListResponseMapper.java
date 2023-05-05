package com.devsuperior.home.model.mapper;

import com.devsuperior.home.entities.Product;
import com.devsuperior.home.model.dto.ProductListDTO;
import com.devsuperior.home.model.vo.ProductVO;

import java.util.ArrayList;
import java.util.List;

public class ProductListResponseMapper {

    private final ProductListDTO productListDTO = new ProductListDTO();

    public ProductListResponseMapper(List<Product> list){

        List<ProductVO> productVOList = new ArrayList<>();

        for (Product product : list){
            ProductVO productVO = new ProductVO();
            productVO.setId(product.getId());
            productVO.setName(product.getName());
            productVO.setPrice("R$ ".concat(String.format("%.2f", product.getPrice())));
            productVO.setDepartment(product.getDepartment());
            productVOList.add(productVO);
        }
        productListDTO.setProductVOList(productVOList);
    }

    public ProductListDTO getProductListDTO() {
        return productListDTO;
    }
}

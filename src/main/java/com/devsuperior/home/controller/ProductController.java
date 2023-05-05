package com.devsuperior.home.controller;

import com.devsuperior.home.model.dto.ProductListDTO;
import com.devsuperior.home.model.dto.ProductRequestDTO;
import com.devsuperior.home.model.vo.ProductVO;
import com.devsuperior.home.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ProductVO saveProduct(@RequestBody ProductRequestDTO requestDTO){
        return productService.saveProduct(requestDTO);
    }
    @GetMapping
    public ProductListDTO getObjects() {
        return productService.getListProduct();
    }

    @GetMapping("/{id}")
    public ProductVO getProduct(@PathVariable Long id){
        return productService.getProduct(id);
    }
}

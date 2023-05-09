package com.devsuperior.home.controller;

import com.devsuperior.home.model.dto.ProductListDTO;
import com.devsuperior.home.model.dto.ProductRequestDTO;
import com.devsuperior.home.model.vo.ProductVO;
import com.devsuperior.home.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
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

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ProductVO update(@PathVariable Long id, @RequestBody ProductRequestDTO requestDTO){
        return productService.updateProduct(id,requestDTO);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.MULTI_STATUS)
    public String deleteById(@PathVariable Long id){
     productService.deleteById(id);
     return ResponseEntity.status(207).body("Dados apagados do produto id " + id).getBody();
    }
}

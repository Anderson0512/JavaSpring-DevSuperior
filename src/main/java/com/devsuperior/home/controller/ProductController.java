package com.devsuperior.home.controller;

import com.devsuperior.home.model.dto.ProductListDTO;
import com.devsuperior.home.model.dto.ProductRequestDTO;
import com.devsuperior.home.model.vo.ProductVO;
import com.devsuperior.home.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

  private final ProductService productService;

  @Autowired
  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @PostMapping
  public ResponseEntity<ProductVO> saveProduct(@RequestBody ProductRequestDTO requestDTO) {
    var prodCreated = productService.saveProduct(requestDTO);
    URI uriLocation = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
            .buildAndExpand(prodCreated.getId()).toUri();
    return ResponseEntity.created(uriLocation).body(prodCreated);
  }

  @GetMapping
  public ProductListDTO getObjects() {
    return productService.getListProduct();
  }

  @GetMapping("/{id}")
  public ProductVO getProduct(@PathVariable Long id) {
    return productService.getProduct(id);
  }

  @PutMapping("/{id}")
  @ResponseStatus(HttpStatus.ACCEPTED)
  public ProductVO update(@PathVariable Long id, @RequestBody ProductRequestDTO requestDTO) {
    return productService.updateProduct(id, requestDTO);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.MULTI_STATUS)
  public String deleteById(@PathVariable Long id) {
    productService.deleteById(id);
    return ResponseEntity.status(207).body("Dados apagados do produto id " + id).getBody();
  }
}

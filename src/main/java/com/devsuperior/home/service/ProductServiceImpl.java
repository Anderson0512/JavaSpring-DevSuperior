package com.devsuperior.home.service;

import com.devsuperior.home.entities.Department;
import com.devsuperior.home.entities.Product;
import com.devsuperior.home.model.dto.ProductListDTO;
import com.devsuperior.home.model.dto.ProductRequestDTO;
import com.devsuperior.home.model.mapper.ProductListResponseMapper;
import com.devsuperior.home.model.mapper.ProductRequestMapper;
import com.devsuperior.home.model.mapper.ProductResponseMapper;
import com.devsuperior.home.model.vo.ProductVO;
import com.devsuperior.home.repository.DepartmentRepository;
import com.devsuperior.home.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;
    private final DepartmentRepository departmentRepository;
    @Autowired
    public ProductServiceImpl(ProductRepository productRepository,DepartmentRepository departmentRepository) {
        this.productRepository = productRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public ProductVO saveProduct(ProductRequestDTO requestDTO) {
        Department dp = departmentRepository.findById(requestDTO.getDepartment()).orElseThrow();
        Product p2 = productRepository.save(new ProductRequestMapper(requestDTO, dp).getProduct());
        return new ProductResponseMapper(p2).getProductVO();
    }

    @Override
    public ProductListDTO getListProduct() {
        List<Product> list = productRepository.findAll();
        return new ProductListResponseMapper(list).getProductListDTO();
    }

    @Override
    public ProductVO getProduct(Long id) {
        Product product = productRepository.findById(id).orElseThrow();
        return new ProductResponseMapper(product).getProductVO();
    }
}

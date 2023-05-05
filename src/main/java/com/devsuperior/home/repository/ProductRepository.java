package com.devsuperior.home.repository;

import com.devsuperior.home.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

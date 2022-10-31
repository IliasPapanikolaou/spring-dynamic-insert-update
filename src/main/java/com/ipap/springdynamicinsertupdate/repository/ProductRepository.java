package com.ipap.springdynamicinsertupdate.repository;

import com.ipap.springdynamicinsertupdate.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}

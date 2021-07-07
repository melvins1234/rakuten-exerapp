package com.rakuten.rakutenweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rakuten.rakutenweb.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

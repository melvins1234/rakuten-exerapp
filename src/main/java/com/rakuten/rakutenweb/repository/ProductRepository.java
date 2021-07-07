package com.rakuten.rakutenweb.repository;

import com.rakuten.rakutenweb.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

package com.jpa.demospringjpa.respository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.demospringjpa.model.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}

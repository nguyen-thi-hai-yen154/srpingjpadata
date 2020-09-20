package com.jpa.demospringjpa.respository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jpa.demospringjpa.model.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

	public static final String _query
	= "SELECT * from "
	+ " product "
	+ " where name like %:name% ";

	@Query(value = _query, nativeQuery = true)
	List<Product> search(@Param("name") String name);
}

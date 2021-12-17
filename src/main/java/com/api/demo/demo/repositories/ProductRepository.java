package com.api.demo.demo.repositories;
//import com.api.demo.demo.models.Product;


import com.api.demo.demo.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ProductRepository extends JpaRepository<Product,Long>{
}

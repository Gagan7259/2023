package com.example.JwtAuthentication.Repository;

import com.example.JwtAuthentication.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}

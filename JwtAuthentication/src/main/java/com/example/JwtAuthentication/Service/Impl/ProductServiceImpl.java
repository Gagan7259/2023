package com.example.JwtAuthentication.Service.Impl;

import com.example.JwtAuthentication.Model.Product;
import com.example.JwtAuthentication.Repository.ProductRepository;
import com.example.JwtAuthentication.Service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements productService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }



    @Override
    public List<Product> getallproducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getProductById(int PrdtId) {
        return productRepository.findById(PrdtId);
    }
}

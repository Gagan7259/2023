package com.example.JwtAuthentication.Service;

import com.example.JwtAuthentication.Model.Product;

import java.util.List;
import java.util.Optional;

public interface productService {

    Product  createProduct(Product product);

    List<Product> getallproducts();

    Optional<Product> getProductById(int PrdtId);
}

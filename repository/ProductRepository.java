package com.example.deneme2.repository;

import com.example.deneme2.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {

}

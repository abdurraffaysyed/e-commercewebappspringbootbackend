package com.example.demo.Repositories;
import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Products;
@Repository
public interface ProductsRepo extends MongoRepository<Products,String>{
    @Query("{'_id':?0,'price':?1}")
    Optional<Products> findByIdAndPrice(String id, int price);
    Optional<Products> findById(String id);
    @Query("value={'name':?0}, delete = true")
    void deleteByName(String productname);
}

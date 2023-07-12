package com.example.demo.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Products;
import com.example.demo.Repositories.ProductsRepo;

import java.util.List;
import java.util.Optional;
@Service
public class ProductsService {
    @Autowired
    private ProductsRepo repo;
    public List<Products> FetchAllProducts(){
        List<Products> p = repo.findAll();
        return p;
    }
    public Optional<Products> FetchProductByID(String id)
    {
        try {
            return repo.findById(id);    
        } catch (Exception e) {
            return null;
        }
        
    }
    public Products AddProduct(Products product)
    {
        return repo.save(product);
    }
    public void DeleteProduct(String productname)
    {
        repo.deleteByName(productname);
        
    }
    public Optional<Products> FetchProductByIDAndPrice(String id, int price){
        try {
            return repo.findByIdAndPrice(id, price);
        } catch (Exception e) {
            return null;
        }
    }
    public Optional<Products> FetchProductByIDUsingPathVariable(String id){
        try {
            return repo.findById(id);
        } catch (Exception e) {
            return null;
        }
    }
    
}

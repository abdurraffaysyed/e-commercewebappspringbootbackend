package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Products;
import com.example.demo.Repositories.ProductsRepo;
import com.example.demo.Services.ProductsService;

@RestController
@RequestMapping("/api/add/products")
public class AddProducts {
    @Autowired
    private ProductsService service;
    
    @PostMapping("/")
    @ResponseBody
    public Products AddProduct(@RequestBody Products products)
    {
        return service.AddProduct(products);
    }
    
}

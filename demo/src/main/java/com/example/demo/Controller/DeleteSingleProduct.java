package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Products;
import com.example.demo.Services.ProductsService;

@RestController
@RequestMapping("/api/delete/")
public class DeleteSingleProduct {
    @Autowired
    private ProductsService service;
   
    
    @DeleteMapping("product")
    public void DeleteProduct(@RequestParam("name") String name)
    {
        service.DeleteProduct(name);
    }
    @DeleteMapping("products")
    public void DeleteProductByNameAndPrice(@RequestParam("name") String name, @RequestParam("price") int productprice)
    {
        service.DeleteProductByNameAndPrice(name, productprice);
    }
    
}

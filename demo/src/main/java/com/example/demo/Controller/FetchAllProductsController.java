package com.example.demo.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Models.Products;
import com.example.demo.Repositories.ProductsRepo;
import com.example.demo.Services.ProductsService;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/products")
public class FetchAllProductsController {
    @Autowired
    ProductsService service;
    @Autowired
    ProductsRepo repo;
    @GetMapping("/")
    public List<Products> FetchAllProducts()
    {
       
        return service.FetchAllProducts();
        
    }
    @GetMapping("/p")
    public Optional<Products> FetchProductByID(@RequestParam("id") String id)
    {
        if(id != null)
            return service.FetchProductByID(id);
        else
            return null;
    }
     @GetMapping("/price")
    public Optional<Products> FetchProductByIDAndPrice(@RequestParam("id") String id, @RequestParam("price") int price)
    {
        if(id != null)
            return service.FetchProductByIDAndPrice(id,price);
        else
            return null;
    }
    @GetMapping("/{id}")
    public Optional<Products> FetchProductByIDUsingPathVariable(@PathVariable String id)
    {
        if(id != null)
            return service.FetchProductByIDUsingPathVariable(id);
        else
            return null;
    }
}

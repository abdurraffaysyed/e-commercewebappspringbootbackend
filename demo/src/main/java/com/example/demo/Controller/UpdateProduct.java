package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Products;
import com.example.demo.Services.ProductsService;

@RestController
@RequestMapping("/api/update/")
public class UpdateProduct {
    private final ProductsService service;
    
    @Autowired
    public UpdateProduct(ProductsService service){
        this.service = service;
    }
    @PutMapping("product")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Products UpdateProduct(@RequestBody Products product){
        return service.UpdateProduct(product);
    }
    @PutMapping("product/by/{productname}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Products> UpdateProductByName(@PathVariable String productname, @RequestBody Products product){
        product.setName(productname);
        return service.UpdateProductByName(productname, product);
    }
}

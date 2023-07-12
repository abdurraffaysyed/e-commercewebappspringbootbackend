package com.example.demo.Models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Products {
    @Id
    private String _id;
    private String name;
    
    private String description;
    
    private int price;
    
    private int countInStock;
    
    private String imageurl;
    
    public void setId(String id)
    {
        _id = id;
    }
    public String getId()
    {
        return _id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setDescription(String description)
    {
        this.description = description; 
    }
    public String getDesc()
    {
        return name;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
    public int getPrice()
    {
        return price;
    }
    public void setCount(int cis)
    {
        countInStock = cis;
    }
    public int getCount()
    {
        return countInStock;
    }
    public void setURL(String url)
    {
        imageurl = url;
    }
    public String getURL()
    {
        return imageurl;
    }
}

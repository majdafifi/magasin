package com.example.magasin.Services;

import com.example.magasin.entities.Category;
import com.example.magasin.entities.Product;

import java.util.List;
import java.util.Map;

public interface ProductService {
    public Product addProduct(Product p);
    public Product updateProduct(long idp, Product product);
    public Product getProduct(long id);
    public List<Product> getProducts();
    public Map<String,Boolean>deleteProduct(long id);

    public List<Product> getByCategory(Category  category);
    public List<Product> search(Category category,String name);




}

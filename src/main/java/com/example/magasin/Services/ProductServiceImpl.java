package com.example.magasin.Services;

import com.example.magasin.entities.Category;
import com.example.magasin.entities.Product;
import com.example.magasin.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
  @Autowired
    ProductRepository productRepository;
    @Override
    public Product addProduct(Product p) {
        return productRepository.save(p);
    }

    @Override
    public Product updateProduct(long idp, Product product) {
   Product old=productRepository.findById(idp).get();
   old.setCategory(product.getCategory());
        old.setName(product.getName());
        old.setDescription(product.getDescription());
        old.setPrice(product.getPrice());
        return productRepository.save(old) ;
    }

    @Override
    public Product getProduct(long id) {

        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> getProducts() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public List<Product> getByCategory(Category category) {
        return null;
    }

    @Override
    public List<Product> search(Category category, String name) {
        return null;
    }

    @Override
    public Map<String, Boolean> deleteProduct(long id) {
        productRepository.deleteById(id);
        Map<String,Boolean> res=new HashMap<>();
        res.put("deleted",Boolean.TRUE);
        return res;
    }
}

package com.example.magasin.JavaController;

import com.example.magasin.Services.ProductService;
import com.example.magasin.entities.Product;
import com.example.magasin.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")
public class ProductController {
    @Autowired
            //injectable fi angular
    ProductService productService;

    @GetMapping ( "/welcome")
    public  String welcome(){
        return "you are welcome";

    }

@PostMapping
public Product createProduct(@RequestBody Product product){
   return  productService.addProduct(product);
}
    @GetMapping
    public List<Product> getAll(){

        return (List<Product>) productService.getProducts();
    }
    @GetMapping(value = "/{id}")
    public  Product getProduct(@PathVariable("id")long id){
        return  productService.getProduct(id) ;
    }


    @DeleteMapping(value = "/{id}")
    public Map<String,Boolean> deleteProduct(@PathVariable("id")long id)  {
        return productService.deleteProduct(id);
    }
    @PutMapping(value = "/{id}")
    public Product updateProduct(@PathVariable("id") long id,@RequestBody Product product){
        return productService.updateProduct(id, product);
    }
}

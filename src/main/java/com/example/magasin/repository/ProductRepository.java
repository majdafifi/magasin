package com.example.magasin.repository;

import com.example.magasin.entities.Category;
import com.example.magasin.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository  extends CrudRepository<Product,Long> {
public List<Product> findByCategory(Category category);
public List<Product> findByCategoryAndName(Category category,String name);
//jpql
@Query(value = "SELECT p FROM Product p WHERE p.category=:category AND p.name LIKE :name")
public List<Product> search(@Param("category")Category category,@Param("name")String name);
//sql
@Query(value = "SELECT p FROM products p WHERE p.category_product = ?1 AND p.name_product like %?2%",nativeQuery = true)
    public List<Product>searchNative(Category category,String name);
}

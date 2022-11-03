package com.example.magasin.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "product_id")
   private long id;
 //  @Column(name = "name_products",length = 20)
   private String name;
   @Enumerated(EnumType.STRING)
 //  @Column(name = "category_product")
   private Category category;
   private  String description;
   private double price;
   // @Transient
  // private int age;
@OneToMany(mappedBy = "product",fetch = FetchType.LAZY,cascade = CascadeType.ALL)

 private    List<Comment> comments;


}

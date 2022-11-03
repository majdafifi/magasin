package com.example.magasin.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
@Data
public class Comment implements Serializable {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private  String text;
     private LocalDateTime creationTime;
     @ManyToOne
     @JoinColumn(name = "product_id",referencedColumnName = "product_id")

     private  Product product;




}

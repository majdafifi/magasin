package com.example.magasin.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "commandes")
@Data
public class Commande  implements Serializable {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 private LocalDateTime creationTime;



}

package com.example.magasin.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "lignes_commandes")
public class LigneCommande implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "product_id",referencedColumnName = "product_id")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "commande_id",referencedColumnName = "id")
    private Commande commande;

}

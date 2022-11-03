package com.example.magasin.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Emloyee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private String name;
    @ManyToMany
    @JoinTable(name = "affectations",joinColumns=@JoinColumn(name = "projet_id"),inverseJoinColumns=@JoinColumn(name="emloyee_id"))
    private List<Projet> projets;

}

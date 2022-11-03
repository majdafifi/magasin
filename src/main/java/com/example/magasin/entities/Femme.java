package com.example.magasin.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Data
public class Femme extends  Personne{
    @OneToOne
    @JoinColumn(name = "conjoint",nullable = true)
    private Homme homme;
}

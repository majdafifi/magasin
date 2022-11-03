package com.example.magasin.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Data
public class Homme extends  Personne{
    @OneToOne(mappedBy = "homme")

    private  Femme femme;
}

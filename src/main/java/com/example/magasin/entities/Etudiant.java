package com.example.magasin.entities;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@DiscriminatorValue("ET")
public class Etudiant extends  Personne {
    private  long numCarte;

}

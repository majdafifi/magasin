package com.example.magasin.entities;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@DiscriminatorValue("EN")
public class Enseignant extends  Personne{
    private  String specialiste;
}

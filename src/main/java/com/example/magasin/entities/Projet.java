package com.example.magasin.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity



@Data
public class Projet  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private String name;
    @ManyToMany
    @JoinTable(name = "affectations",joinColumns=@JoinColumn(name = "emloyee_id"),inverseJoinColumns=@JoinColumn(name="projet_id"))
    private List<Emloyee>  emlpoyees;

}

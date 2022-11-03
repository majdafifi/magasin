package com.example.magasin.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name ="Type",length = 2)
public class Personne  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;


}

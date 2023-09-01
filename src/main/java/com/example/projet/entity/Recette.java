package com.example.projet.entity;

import javax.persistence.*;

@Entity
@Table(name="recettes")
public class Recette {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    @Column(unique = false)
    private String name;
    private String description;
    private Integer nombre;

    public Recette(Integer id, String name, String ingredients, String description, Integer nombre) {
        Id = id;
        this.name = name;
        this.description = description;
        this.nombre = nombre;
    }

    public Recette() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Recette{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", nombre=" + nombre +
                '}';
    }
}









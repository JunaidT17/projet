package com.example.projet.entity;

import javax.persistence.*;

@Entity
@Table(name="recettes")
public class Recette {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    @Column(unique = false)
private String ingredients;
    private Integer temps;
    private Integer nombre;

    public Recette(Integer id, String ingredients, Integer temps, Integer nombre) {
        Id = id;
        this.ingredients = ingredients;
        this.temps = temps;
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

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public Integer getTemps() {
        return temps;
    }

    public void setTemps(Integer temps) {
        this.temps = temps;
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
                ", ingredients='" + ingredients + '\'' +
                ", temps=" + temps +
                ", nombre=" + nombre +
                '}';
    }
}








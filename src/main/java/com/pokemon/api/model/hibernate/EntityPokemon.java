package com.pokemon.api.model.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.util.List;

@Entity(name = "POKEMON")
public class EntityPokemon {

    @Id
    private Integer id;
    private List<EntityAbility> abilities;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

// Copyright (c) 2022 Boomi, Inc.
package com.pokemon.api.model.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "ABILITY")
public class EntityAbility {

    @Id
    private Integer id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "is_main_series")
    private boolean isMainSeries;

    public EntityAbility(){

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMainSeries(boolean mainSeries) {
        isMainSeries = mainSeries;
    }
}

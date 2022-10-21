// Copyright (c) 2022 Boomi, Inc.
package com.pokemon.api.model.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import java.util.List;

@Entity
@Table(name = "NAMES")
public class EntityNames {

    @Id
    @GeneratedValue
    private Integer id;
    @ManyToMany
    private List<EntityLanguage> language;

}

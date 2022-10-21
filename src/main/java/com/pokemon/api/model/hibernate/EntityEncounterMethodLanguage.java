// Copyright (c) 2022 Boomi, Inc.
package com.pokemon.api.model.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "encounter_method_language")
public class EntityEncounterMethodLanguage {

    @Id
    @GeneratedValue
    private Integer id;
    @OneToOne
    private EntityLanguage language;
    @Column
    private String name;
    @ManyToOne
    @JoinColumn(name = "id")
    private EntityEncounterMethod entityEncounterMethod;

    public EntityEncounterMethodLanguage() {

    }

    public Integer getId() {
        return id;
    }

    public EntityLanguage getLanguage() {
        return language;
    }

    public void setLanguage(EntityLanguage language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EntityEncounterMethod getEntityEncounterMethod() {
        return entityEncounterMethod;
    }

    public void setEntityEncounterMethod(EntityEncounterMethod entityEncounterMethod) {
        this.entityEncounterMethod = entityEncounterMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EntityEncounterMethodLanguage that = (EntityEncounterMethodLanguage) o;
        return Objects.equals(id, that.id) && Objects.equals(language, that.language) && Objects.equals(name, that.name)
                && Objects.equals(entityEncounterMethod, that.entityEncounterMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, language, name, entityEncounterMethod);
    }
}

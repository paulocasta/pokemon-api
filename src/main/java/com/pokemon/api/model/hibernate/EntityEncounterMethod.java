// Copyright (c) 2022 Boomi, Inc.
package com.pokemon.api.model.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "encounter_method")
public class EntityEncounterMethod {

    @Id
    private Integer id;
    @Column
    private String name;
    @OneToMany
    private List<EntityEncounterMethodLanguage> names;
    @Column
    private Integer order;

    public EntityEncounterMethod() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<EntityEncounterMethodLanguage> getNames() {
        return names;
    }

    public void setNames(List<EntityEncounterMethodLanguage> names) {
        this.names = names;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EntityEncounterMethod method = (EntityEncounterMethod) o;
        return Objects.equals(id, method.id) && Objects.equals(name, method.name) && Objects.equals(names, method.names)
                && Objects.equals(order, method.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, names, order);
    }
}

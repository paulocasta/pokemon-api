// Copyright (c) 2022 Boomi, Inc.
package com.pokemon.api.model.hibernate;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "EFFECT_ENTRY")
public class EntityEffectEntry {

    @Id
    private Integer id;
    @OneToOne
    private EntityAbility ability;
    @Column
    @Type(type = "text")
    private String effect;
    @OneToOne
    private EntityLanguage language;
    @Column(name = "short_effect")
    @Type(type = "text")
    private String shortEffect;

    public EntityEffectEntry() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EntityAbility getAbility() {
        return ability;
    }

    public void setAbility(EntityAbility ability) {
        this.ability = ability;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public EntityLanguage getLanguage() {
        return language;
    }

    public void setLanguage(EntityLanguage language) {
        this.language = language;
    }

    public String getShortEffect() {
        return shortEffect;
    }

    public void setShortEffect(String shortEffect) {
        this.shortEffect = shortEffect;
    }
}

package com.pokemon.api.model.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ability {
    private Integer id;
    private String name;
    @JsonProperty("is_main_series")
    private boolean isMainSeries;
    private NamedAPIResource generation;
    private List<Name> names;
    @JsonProperty("effect_entries")
    private List<VerboseEffect> effectEntries;
    @JsonProperty("effect_changes")
    private List<AbilityEffectChange> effectChanges;
    @JsonProperty("flavor_text_entries")
    private List<AbilityFlavorText> flavorTextEntries;
    @JsonProperty
    private List<PokemonAbility> pokemon;

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

    public boolean isMainSeries() {
        return isMainSeries;
    }

    public void setMainSeries(boolean mainSeries) {
        isMainSeries = mainSeries;
    }

    public NamedAPIResource getGeneration() {
        return generation;
    }

    public void setGeneration(NamedAPIResource generation) {
        this.generation = generation;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<VerboseEffect> getEffectEntries() {
        return effectEntries;
    }

    public void setEffectEntries(List<VerboseEffect> effectEntries) {
        this.effectEntries = effectEntries;
    }

    public List<AbilityEffectChange> getEffectChanges() {
        return effectChanges;
    }

    public void setEffectChanges(List<AbilityEffectChange> effectChanges) {
        this.effectChanges = effectChanges;
    }

    public List<AbilityFlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    public void setFlavorTextEntries(List<AbilityFlavorText> flavorTextEntries) {
        this.flavorTextEntries = flavorTextEntries;
    }

    public List<PokemonAbility> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<PokemonAbility> pokemon) {
        this.pokemon = pokemon;
    }
}

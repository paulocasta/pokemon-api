package com.pokemon.api.model.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon {

    @JsonProperty
    private List<PokemonAbility> abilities;
    @JsonProperty("base_experience")
    private Integer baseExperience;
    @JsonProperty
    private List<NamedAPIResource> forms;
    @JsonProperty("game_indices")
    private List<VersionGameIndex> gameIndices;
    @JsonProperty
    private Integer height;
    @JsonProperty("held_items")
    private List<PokemonHeldItem> heldItems;
    @JsonProperty
    private Integer id;
    @JsonProperty("is_default")
    private boolean isDefault;
    @JsonProperty("location_area_encounters")
    private String locationAreaEncounter;
    @JsonProperty
    private List<PokemonMove> moves;
    @JsonProperty
    private String name;
    @JsonProperty
    private Integer order;
    @JsonProperty("past_types")
    private List<PokemonTypePast> pastTypes;
    @JsonProperty
    private NamedAPIResource species;
    @JsonProperty
    private PokemonSprite sprites;
    @JsonProperty
    private List<PokemonStat> stats;
    @JsonProperty
    private List<PokemonType> types;
    @JsonProperty
    private Integer weight;
}

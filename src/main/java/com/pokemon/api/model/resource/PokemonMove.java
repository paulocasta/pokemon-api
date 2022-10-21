package com.pokemon.api.model.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonMove {

    @JsonProperty
    private NamedAPIResource move;
    @JsonProperty("version_group_details")
    private List<PokemonMoveVersion> versionGroupDetails;
}

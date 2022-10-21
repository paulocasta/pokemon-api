package com.pokemon.api.model.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonMoveVersion {

    @JsonProperty("move_learn_method")
    private NamedAPIResource moveLearnMethod;
    @JsonProperty("version_group")
    private NamedAPIResource versionGroup;
    @JsonProperty("level_learned_at")
    private Integer levelLearnedAt;
}

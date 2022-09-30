package com.pokemon.api.model.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Encounter {

    @JsonProperty("min_level")
    private Integer minLevel;
    @JsonProperty("max_level")
    private Integer maxLevel;
    @JsonProperty("condition_values")
    private List<NamedAPIResource> conditionValues;
    private Integer chance;
    private NamedAPIResource method;

    public Integer getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(Integer minLevel) {
        this.minLevel = minLevel;
    }

    public Integer getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(Integer maxLevel) {
        this.maxLevel = maxLevel;
    }

    public List<NamedAPIResource> getConditionValues() {
        return conditionValues;
    }

    public void setConditionValues(List<NamedAPIResource> conditionValues) {
        this.conditionValues = conditionValues;
    }

    public Integer getChance() {
        return chance;
    }

    public void setChance(Integer chance) {
        this.chance = chance;
    }

    public NamedAPIResource getMethod() {
        return method;
    }

    public void setMethod(NamedAPIResource method) {
        this.method = method;
    }
}

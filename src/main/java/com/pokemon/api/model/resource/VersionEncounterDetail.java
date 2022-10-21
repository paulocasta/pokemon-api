package com.pokemon.api.model.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VersionEncounterDetail {
    private NamedAPIResource version;
    @JsonProperty("max_change")
    private Integer maxChance;
    @JsonProperty("encounter_details")
    private Encounter encounterDetails;

    public NamedAPIResource getVersion() {
        return version;
    }

    public void setVersion(NamedAPIResource version) {
        this.version = version;
    }

    public Integer getMaxChance() {
        return maxChance;
    }

    public void setMaxChance(Integer maxChance) {
        this.maxChance = maxChance;
    }

    public Encounter getEncounterDetails() {
        return encounterDetails;
    }

    public void setEncounterDetails(Encounter encounterDetails) {
        this.encounterDetails = encounterDetails;
    }
}

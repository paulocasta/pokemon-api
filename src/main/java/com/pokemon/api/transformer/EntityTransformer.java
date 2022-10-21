// Copyright (c) 2022 Boomi, Inc.
package com.pokemon.api.transformer;

import com.pokemon.api.model.hibernate.EntityLanguage;
import com.pokemon.api.model.resource.Language;

public final class EntityTransformer {

    private EntityTransformer() {

    }

    public static EntityLanguage toEntityLanguage(Language language) {
        EntityLanguage entityLanguage = new EntityLanguage();
        entityLanguage.setId(language.getId());
        entityLanguage.setName(language.getName());
        entityLanguage.setOfficial(language.isOfficial());
        entityLanguage.setIso3166(language.getIso3166());
        entityLanguage.setIso639(language.getIso639());
        return entityLanguage;
    }
}

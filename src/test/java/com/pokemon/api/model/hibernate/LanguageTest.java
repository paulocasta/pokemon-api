// Copyright (c) 2022 Boomi, Inc.
package com.pokemon.api.model.hibernate;

import com.pokemon.api.connection.Endpoint;
import com.pokemon.api.connection.RestConnection;
import com.pokemon.api.model.resource.Language;
import com.pokemon.api.model.resource.NamedAPIResource;
import com.pokemon.api.model.resource.ResultList;
import com.pokemon.api.transformer.EntityTransformer;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

class LanguageTest {

    private final static Integer ID_EN = 9;

    private final static RestConnection REST_CONNECTION = new RestConnection();

    @Test
    void populateTableLanguageWithService() {
        // Get all languages
        ResultList languages = REST_CONNECTION.getResultList(Endpoint.LANGUAGE_URL);
        Assert.notNull(languages, () -> "Languages not found");
        Assert.notEmpty(languages.getResults(), () -> "Languages are empty");

        // Iterate all the result calling the service
        for (NamedAPIResource resource : languages.getResults()) {
            Language language = REST_CONNECTION.getLanguage(resource.getUrl());
            if (language != null) {
                EntityLanguage lan = EntityTransformer.toEntityLanguage(language);
                try (Session session = SessionUtil.getSession()) {
                    Transaction transaction = session.beginTransaction();
                    session.save(lan);
                    transaction.commit();
                }
            }
        }
    }

    @Test
    void getEntityLanguage() {
        try (Session session = SessionUtil.getSession()) {
            // 9 is the ID "en" on the DB
            EntityLanguage language = session.get(EntityLanguage.class, ID_EN);
            Assert.notNull(language, () -> "ID not found " + ID_EN);
        }
    }
}

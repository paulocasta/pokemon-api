// Copyright (c) 2022 Boomi, Inc.
package com.pokemon.api.model.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;

class EncounterMethodTest {
    private static final String ENCOUNTER_METHOD_NAME = "walk";
    private static final Integer ENCOUNTER_METHOD_ORDER = 1;
    private static final String ENCOUNTER_METHOD_LANGUAGE_NAME_EN = "Walking in tall grass or a cave";
    private static final String ENCOUNTER_METHOD_LANGUAGE_NAME_DE = "Im hohen Gras oder in einer Höhle laufen";

    @Test
    void createEntity() {
        EntityEncounterMethod encounterMethod = new EntityEncounterMethod();
        encounterMethod.setName(ENCOUNTER_METHOD_NAME);
        encounterMethod.setOrder(ENCOUNTER_METHOD_ORDER);
        encounterMethod.setId(1);

        EntityEncounterMethodLanguage languageEn = new EntityEncounterMethodLanguage();
        languageEn.setName(ENCOUNTER_METHOD_LANGUAGE_NAME_EN);
        //languageEn.setEntityEncounterMethod(encounterMethod);

        EntityEncounterMethodLanguage languageDe = new EntityEncounterMethodLanguage();
        languageDe.setName(ENCOUNTER_METHOD_LANGUAGE_NAME_DE);
        //languageDe.setEntityEncounterMethod(encounterMethod);

        try (Session session = SessionUtil.getSession()) {
            // 9 is the ID "en" on the DB
//            EntityLanguage et = session.get(EntityLanguage.class, 9);
//            Assert.notNull(et, () -> "ID not found " + 9);
//            languageEn.setLanguage(et);
//
//            EntityLanguage etDe = session.get(EntityLanguage.class, 6);
//            Assert.notNull(etDe, () -> "ID not found " + 6);
//            languageDe.setLanguage(etDe);

            Transaction transaction = session.beginTransaction();

            //encounterMethod.setNames(Arrays.asList(languageEn, languageDe));
//            session.save(languageEn);
//            session.save(languageDe);
            session.save(encounterMethod);

            transaction.commit();
        }

    }
}

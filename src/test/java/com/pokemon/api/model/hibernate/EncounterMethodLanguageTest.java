package com.pokemon.api.model.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;

class EncounterMethodLanguageTest {

    @Test
    void createEntity() {
        EntityEncounterMethodLanguage language = new EntityEncounterMethodLanguage();
        EntityEncounterMethod method = new EntityEncounterMethod();
        method.setId(1);
        language.setName("test");
        language.setEntityEncounterMethod(method);
        try (Session session = SessionUtil.getSession()) {
            session.saveOrUpdate(method);
            EntityLanguage et = session.get(EntityLanguage.class, 9);
            language.setLanguage(et);

            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(language);
            transaction.commit();
        }
    }

    @Test
    void test(){
        try (Session session = SessionUtil.getSession()) {

        }
    }
}
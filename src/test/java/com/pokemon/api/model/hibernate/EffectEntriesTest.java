// Copyright (c) 2022 Boomi, Inc.
package com.pokemon.api.model.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;

class EffectEntriesTest {
    private final static String EFFECT = "Attacken die Schaden verursachen haben mit jedem Treffer eine 10% Chance "
            + "das Ziel zurückschrecken zu lassen, wenn die Attacke dies nicht bereits als Nebeneffekt hat.\\n\\nDer "
            + "Effekt stapelt nicht mit dem von getragenen Items.\\n\\nAußerhalb vom Kampf: Wenn ein Pokémon mit "
            + "dieser Fähigkeit an erster Stelle im Team steht, tauchen wilde Pokémon nur halb so oft auf.";
    private final static String SHORT_EFFECT = "Mit jedem Treffer besteht eine 10% Chance das Ziel zurückschrecken zu lassen.";

    @Test
    void addEffectEntryToDB() {
        EntityEffectEntry effectEntry = new EntityEffectEntry();
        EntityAbility ability = new EntityAbility();
        ability.setId(1);
        ability.setName("stench");
        ability.setMainSeries(true);

        effectEntry.setId(1);
        effectEntry.setAbility(ability);
        effectEntry.setEffect(EFFECT);
        effectEntry.setShortEffect(SHORT_EFFECT);

        try (Session session = SessionUtil.getSession()) {
            Transaction tx = session.beginTransaction();
            // 9 is the ID "en" on the DB
            EntityLanguage language = session.get(EntityLanguage.class, 9);

            effectEntry.setLanguage(language);
            session.save(effectEntry);
            tx.commit();
        }
    }
}

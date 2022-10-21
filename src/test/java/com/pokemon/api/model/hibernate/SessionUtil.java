package com.pokemon.api.model.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

final class SessionUtil {

    private static final SessionUtil instance = new SessionUtil();

    private SessionFactory factory;

    private SessionUtil() {
        initialize();
    }

    static Session getSession() {
        return getInstance().factory.openSession();
    }

    public static void forceReload() {
        getInstance().initialize();
    }

    private static SessionUtil getInstance() {
        return instance;
    }

    private void initialize() {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        factory = new MetadataSources(registry).addAnnotatedClass(EntityEncounterMethod.class).buildMetadata()
                .buildSessionFactory();
    }
}
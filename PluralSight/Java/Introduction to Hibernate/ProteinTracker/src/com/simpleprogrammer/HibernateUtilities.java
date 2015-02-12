package com.simpleprogrammer;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtilities {
	private static SessionFactory sessionFactory;
	private static StandardServiceRegistryBuilder serviceRegistry;

	static {
		try {
			// gets the hibernate.cfg.xml and implements the configuration
			// within the file.
			Configuration configuration = new Configuration().configure();

			serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties());
			sessionFactory = configuration.buildSessionFactory(serviceRegistry
					.build());
		} catch (HibernateException e) {
			System.out.println("Problems creating session factory.");
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}

package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.domain.Customer;

public class App {
	public static void main(String[] args) {
		Configuration configure = new Configuration().configure();
		SessionFactory sessionFactory = configure.buildSessionFactory();

		Session session = sessionFactory.openSession();
		// Transaction transaction = session.beginTransaction();

		session.save(new Customer("ren"));

		// transaction.commit();
		session.close();
		sessionFactory.close();
	}
}

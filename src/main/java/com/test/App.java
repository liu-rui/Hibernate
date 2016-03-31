package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.domain.Customer;

public class App {
	public static void main(String[] args) {
        Configuration configure = new Configuration().configure();
       SessionFactory sessionFactory =   configure.buildSessionFactory();       
       
       Session session = sessionFactory.openSession();
       
       session.save(new  Customer("ren"));       
       session.close();
       sessionFactory.close();
	}
}

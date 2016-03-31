package com.test;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.test.domain.Customer;

public class CustomerTest {
    private SessionFactory   sessionFactory;
    private  Session  session;
	
    @Before
	public void init(){
		Configuration configure = new Configuration().configure();
		sessionFactory =  configure.buildSessionFactory();
		session = sessionFactory.openSession();
	}
	
    @After
	public void destory(){
		session.close();
		sessionFactory.close();
	}
	
	@Test
	public void test() {
		 Customer customer = session.get(Customer.class	, 1);		 
		 System.out.println(customer);
		 customer = session.get(Customer.class	, 1);		 
		 System.out.println(customer);
	}

}

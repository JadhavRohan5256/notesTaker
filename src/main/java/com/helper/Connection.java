package com.helper;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Connection {
	public static SessionFactory factory;
	public static SessionFactory getFactory() {
		if(factory == null) {
			factory = new Configuration().configure().buildSessionFactory();
		}
		return factory;
	}
	public static void CloseFactory() {
		if(factory.isOpen()) {
			factory.close();
		}
	}
}

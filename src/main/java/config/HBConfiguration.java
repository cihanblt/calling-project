package config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HBConfiguration {
	
	public static  SessionFactory createSessionFactroy(){
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		return factory;		
	}
	public static Session getSession(){
		Session s = createSessionFactroy().openSession();
		return s;
	}
	
	
}

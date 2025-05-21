package learn.demo.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration conf = new Configuration();
    	conf.configure("hibernate.cfg.xml");
    	
    	SessionFactory factory = conf.buildSessionFactory();
    	
    	Session s = factory.openSession();
    	Transaction tx = s.beginTransaction();
    	
    	Student st = new Student(1,"Deep",22,7.5f);
    	s.persist(st);
    	
    	tx.commit();
    }
}

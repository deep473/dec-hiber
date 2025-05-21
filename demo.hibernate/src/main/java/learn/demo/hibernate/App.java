package learn.demo.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration conf = new Configuration();
    	conf.configure("hibernate.cfg.xml");
    	
    	SessionFactory factory = conf.buildSessionFactory();
    	System.out.println(factory);
    }
}

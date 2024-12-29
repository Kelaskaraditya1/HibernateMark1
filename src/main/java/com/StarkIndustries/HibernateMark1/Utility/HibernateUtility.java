package com.StarkIndustries.HibernateMark1.Utility;

import com.StarkIndustries.HibernateMark1.Keys.Keys;
import com.StarkIndustries.HibernateMark1.Models.Employee;
import com.StarkIndustries.HibernateMark1.Models.Student;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtility {

    public static SessionFactory sessionFactory;

    public HibernateUtility(){

    }

    public static SessionFactory getSessionFactory(){

        if(sessionFactory==null){
            Configuration configuration = new Configuration();
            Properties properties = new Properties();
            properties.put(Environment.DRIVER, Keys.DATABASE_DRIVER);
            properties.put(Environment.URL,Keys.DATABASE_URL);
            properties.put(Environment.USER,Keys.USERNAME);
            properties.put(Environment.PASS,Keys.PASSWORD);
            properties.put(Environment.DIALECT,Keys.DIALECT);
            properties.put(Environment.HBM2DDL_AUTO,Keys.HBM2DDL_AUTO);
            properties.put(Environment.SHOW_SQL,true);
            properties.put(Environment.FORMAT_SQL,true);
            configuration.setProperties(properties);

            // Every class with Annotation has to added to configuration
            configuration.addAnnotatedClass(Student.class);
            configuration.addAnnotatedClass(Employee.class);

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);

        }
        return sessionFactory;
    }
}

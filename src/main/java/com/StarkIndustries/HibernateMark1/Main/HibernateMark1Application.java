package com.StarkIndustries.HibernateMark1.Main;

import com.StarkIndustries.HibernateMark1.Models.Student;
import com.StarkIndustries.HibernateMark1.Utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateMark1Application {

	public static void main(String[] args) {
		SpringApplication.run(HibernateMark1Application.class, args);

//		XML Based configuration of Session Factory

//		Configuration configuration = new Configuration();
//		configuration.configure("com/StarkIndustries/HibernateMark1/Configurations/hibernate.cfg.xml");
//		SessionFactory sessionFactory = configuration.buildSessionFactory();
//		System.out.println(sessionFactory);

//		Java Based Configuration of SessionFactory

		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
//		Student student = new Student("2021FHCO042","Aditya Kelaskar","kelaskaraditya1@gmail.com",54,"Computer");
		Student student1 = new Student("2021FHCO054","Mayur Khatal","mayurkhatal1@gmail.com",56,"Computer");
		Student student2 = new Student("2021FHCO056","Kirti Khairnar","kirtikhairnar1@gmail.com",55,"Computer");
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(student1);
		session.save(student2);
		transaction.commit();
		session.close();

	}

}

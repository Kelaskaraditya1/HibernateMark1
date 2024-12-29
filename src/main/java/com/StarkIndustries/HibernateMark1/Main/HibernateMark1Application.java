package com.StarkIndustries.HibernateMark1.Main;

import com.StarkIndustries.HibernateMark1.Models.Employee;
import com.StarkIndustries.HibernateMark1.Models.Student;
import com.StarkIndustries.HibernateMark1.Utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

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
		System.out.println(sessionFactory);

		// for Entering Student Entitiy

//		Student student = new Student("2021FHCO042","Aditya Kelaskar","kelaskaraditya1@gmail.com",54,"Computer");
//		Student student1 = new Student("2021FHCO054","Mayur Khatal","mayurkhatal1@gmail.com",56,"Computer");
//		Student student2 = new Student("2021FHCO056","Kirti Khairnar","kirtikhairnar1@gmail.com",55,"Computer");
//		Session session = sessionFactory.openSession();
//		Transaction transaction = session.beginTransaction();
//		session.save(student1);
//		session.save(student2);
//		transaction.commit();
//		session.close();

		// For Entering Employee Details

//		Employee employee = new Employee();
//		employee.setName("Aditya Kelaskar");
//		employee.setEmail("kelaskaraditya1@gmail.com");
//		employee.setSalery(20000.00);
//		employee.setStatus(true);
//		employee.setToken("2021FHCO042");
//		employee.setJoiningData(new Date());
//		Session session = sessionFactory.openSession();
//		Transaction transaction = session.beginTransaction();
//		session.save(employee);
//		transaction.commit();
//		session.close();

//		for getting Object on the basis of Primary-Key

		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Student student1 = session.get(Student.class,"2021FHCO042");
		Student student2 = session.get(Student.class,"2021FHCO056");
		System.out.println(student1);
		System.out.println();
		System.out.println(student2);

	}

}

package com.hibernanteapp.hibernateapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.hibernanteapp.hibernateapp.model.Certificate;
import com.hibernanteapp.hibernateapp.model.Student;
import com.hibernanteapp.hibernateapp.repositeries.StudentRepistery;

@AutoConfiguration
@SpringBootApplication
public class HibernateappApplication {

	public static void main(String[] args)  {
		ConfigurableApplicationContext context = SpringApplication.run(HibernateappApplication.class, args);
		StudentRepistery studentRepistery = context.getBean(StudentRepistery.class);
		Student student = new Student();

	
		student.setAddress("Vehari");
		student.setName("Ali Hasan Mubarak");
		Certificate certificate = new Certificate();
		certificate.setCourse("Spring Boot");
		certificate.setDuration("1 Month");
		student.setCerti(certificate);
		Student save = studentRepistery.save(student);
		System.out.println(save);
	}

}

package com.hibernanteapp.hibernateapp;

import java.io.FileInputStream;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hibernanteapp.hibernateapp.model.User;
import com.hibernanteapp.hibernateapp.repositeries.UserRepositery;

@AutoConfiguration
@SpringBootApplication
public class HibernateappApplication {

	public static void main(String[] args) throws IOException {
		ApplicationContext context = SpringApplication.run(HibernateappApplication.class, args);
		UserRepositery userRepositery = context.getBean(UserRepositery.class);
		User user = new User();

		user.setAddress("vehari");
		user.setAge("18");
		user.setSalary(1222222);
		user.setIsOpen(true);
		user.setName("Roy Ali Hasan");
		user.setX(1212121211111.1);
		user.setCity("Vehari");
		FileInputStream fis = new FileInputStream("src/main/java/ali.jpeg");
		byte[] data = new byte[fis.available()];
		fis.read(data);
		user.setImage(data);
		User save = userRepositery.save(user);
		System.out.println(save);

	}

}

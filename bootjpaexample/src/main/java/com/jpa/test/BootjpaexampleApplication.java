package com.jpa.test;

import java.util.*;
import java.util.Optional;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication(scanBasePackages = "com.jpa")
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);
		//below comment is used to take input in db for user
		//		User user=new User();
//		user.setName("Roshan");
//		user.setCity("kolkata");
//		user.setStatus("single");
//		
//		User user1=userRepository.save(user);
		
//		User u1=new User();
//		u1.setName("Raj");
//		u1.setCity("bihar");
//		u1.setCity("kolkata");
//		u1.setStatus("single");
//		
//		User u2=new User();
//		u2.setName("Raja");
//		u2.setCity("bombay");
//		u2.setCity("kol");
//		u2.setStatus("not single");
//		
//		List<User> lis= List.of(u1,u2);
//		Iterable<User> result=userRepository.saveAll(lis);
//		result.forEach(user->{
//			System.out.println(user);
//		});
//		
		
		//update  the user of id
		//this line is used to get the data from the user which is a table in the database
//		Optional<User> optional=userRepository.findById(1);
//		User user=optional.get();
//		user.setName("Roshan Singh");
//		user=userRepository.save(user);
//		System.out.println(user);
		
		//get the whole row of the table
//		Iterable<User> itr=userRepository.findAll();
//		Iterator<User> iterator=itr.iterator();
//		while(iterator.hasNext())
//		{
//			User user=iterator.next();
//			System.out.println(user);
//		}
//		
		//deleting the user
//		userRepository.deleteById(2);
		
		//now its the custom method so lets go
		
//		List<User> users=userRepository.findByName("Roshan Singh");
//		users.forEach(e->System.out.println(e));

		
//		List<User> users=userRepository.findByNameAndCity("Roshan Singh","kolkata");
//		users.forEach(e->System.out.println(e));
		
		List<User> users=userRepository.getAllUser();
		users.forEach(e->System.out.println(e));
		
		
		
		
	}

}

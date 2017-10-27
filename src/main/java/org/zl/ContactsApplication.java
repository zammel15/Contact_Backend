package org.zl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.zl.dao.ContactRepository;
import org.zl.entities.Contact;

@SpringBootApplication
public class ContactsApplication implements CommandLineRunner {

   @Autowired
   private ContactRepository contactRepository ;
	
	public static void main(String[] args) {
		SpringApplication.run(ContactsApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
	contactRepository.save( new Contact("khalifa", "zammel", df.parse("12/08/1992"), "khalifazammmel@gmail.com", 50677132, "zammel.png"));
	contactRepository.save( new Contact("jamel", "zammel", df.parse("12/08/1992"), "jamelzammmel@gmail.com", 50677132, "jamel.png"));
	contactRepository.save( new Contact("jamel", "zammel", df.parse("12/08/1992"), "alizammmel@gmail.com", 50677132, "ali.png"));

	contactRepository.findAll().forEach(c->{
		System.out.println(c.getNom());
	});
	}
}

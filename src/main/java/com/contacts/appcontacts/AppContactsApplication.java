package com.contacts.appcontacts;

import com.contacts.dao.ContactRepository;
import com.contacts.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class AppContactsApplication implements CommandLineRunner {
    @Autowired
    private ContactRepository contactRepository;
    public static void main(String[] args) {
        SpringApplication.run(AppContactsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        contactRepository.save(new Contact("hassani","Mohammed",df.parse("10/02/1998"),"hassani@gmail.com","0623617871",""));
        contactRepository.save(new Contact("Lamghari","Toufik",df.parse("10/02/1998"),"hassani@gmail.com","0623617871",""));
        contactRepository.save(new Contact("skhghq","qjdsgq",df.parse("10/02/1998"),"hassani@gmail.com","0623617871",""));
        contactRepository.save(new Contact("sdh","qshgdg",df.parse("10/02/1998"),"hassani@gmail.com","0623617871",""));
        contactRepository.save(new Contact("shsq","dfhy",df.parse("10/02/1998"),"hassani@gmail.com","0623617871",""));
        contactRepository.findAll().forEach(c -> {
            System.out.println(c.getNom());
        });
    }
}
